package com.benom.benom.controller

import com.benom.benom.model.shop.Address
import com.benom.benom.repository.MerchantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

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