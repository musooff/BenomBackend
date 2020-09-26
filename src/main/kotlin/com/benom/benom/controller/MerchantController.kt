package com.benom.benom.controller

import com.benom.benom.model.merchant.CreateShop
import com.benom.benom.model.shop.Address
import com.benom.benom.repository.MerchantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/merchant")
class MerchantController {

    @Autowired
    private lateinit var repository: MerchantRepository

    @PostMapping("/add/address")
    fun addAddress(@RequestParam("address") address: Address) {
        // add address to merchant
    }
}