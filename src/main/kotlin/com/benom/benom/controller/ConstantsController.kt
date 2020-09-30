package com.benom.benom.controller

import com.benom.benom.model.contstants.City
import com.benom.benom.model.contstants.Province
import com.benom.benom.repository.CityRepository
import com.benom.benom.repository.ProvinceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/constants")
class ConstantsController {

    @Autowired
    private lateinit var provinceRepository: ProvinceRepository

    @Autowired
    private lateinit var cityRepository: CityRepository

    @GetMapping("/province/all")
    fun getProvinces(): List<Province> {
        return provinceRepository.findAll()
    }


    @GetMapping("/cities/all")
    fun getCities(): List<City> {
        return cityRepository.findAll()
    }

}