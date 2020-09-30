package com.benom.benom.controller

import com.benom.benom.model.merchant.CreateShop
import com.benom.benom.model.merchant.Merchant
import com.benom.benom.model.response.BooleanResponse
import com.benom.benom.model.shop.Address
import com.benom.benom.model.shop.Shop
import com.benom.benom.repository.AddressRepository
import com.benom.benom.repository.MerchantRepository
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

    @Autowired
    private lateinit var merchantRepository: MerchantRepository

    @GetMapping("/exists")
    fun isShopAvailable(@RequestBody createShop: CreateShop): BooleanResponse {
        val shopExists = shopRepository.existsByName(createShop.shopName)
        return BooleanResponse(shopExists)
    }

    @PostMapping("/create")
    fun createShop(@RequestBody shop: Shop) {

        val address = saveAddress(shop.address)
        val merchant = saveMerchant(shop.merchant)
        val newShop = shop.copy(
            domain = generateShopDomain(shop.name),
            featuredProducts = ArrayList(),
            address = address,
            merchant = merchant
        )
        shopRepository.save(newShop)
    }

    @GetMapping("/all")
    fun getAllShops(): List<Shop> = shopRepository.findAll()

    private fun generateShopDomain(shopName: String): String {
        return "https://${shopName.replace("\\s".toRegex(), "").toLowerCase()}.benom.com"
    }

    private fun saveAddress(address: Address): Address {
        return addressRepository.save(address)
    }

    private fun saveMerchant(merchant: Merchant): Merchant {
        return merchantRepository.save(merchant)

    }
}