package com.benom.benom.controller

import com.benom.benom.model.merchant.CreateShop
import com.benom.benom.model.response.BooleanResponse
import com.benom.benom.model.shop.Address
import com.benom.benom.model.shop.Shop
import com.benom.benom.repository.AddressRepository
import com.benom.benom.repository.ShopRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/shop")
class ShopController {

    @Autowired
    private lateinit var shopRepository: ShopRepository

    @Autowired
    private lateinit var addressRepository: AddressRepository

    @GetMapping("/exists")
    fun isShopAvailable(@RequestBody createShop: CreateShop): BooleanResponse {
        val shopExists = shopRepository.existsByName(createShop.shopName)
        return BooleanResponse(shopExists)
    }

    @PostMapping("/create")
    fun createShop(@RequestBody shop: Shop) {

        val address = saveAddress(shop.address)
        val newShop = shop.copy(
            id = generateShopId(shop.name),
            domain = generateShopDomain(shop.name),
            featuredProducts = ArrayList(),
            address = address
        )
        shopRepository.save(newShop)
    }

    @GetMapping("/all")
    fun getAllShops(): List<Shop> = shopRepository.findAll()

    private fun generateShopId(shopName: String): String {
        return "${shopName}_${System.currentTimeMillis()}"
    }

    private fun generateShopDomain(shopName: String): String {
        return "https://${shopName.replace("\\s".toRegex(), "").toLowerCase()}.benom.com"
    }

    private fun saveAddress(address: Address): Address {
        val newAddress = address.copy(
            id = generateAddressId(address),
            website = null
        )
        return addressRepository.save(newAddress)
    }

    private fun generateAddressId(address: Address): String {
        return "${address.address}_${System.currentTimeMillis()}"
    }
}