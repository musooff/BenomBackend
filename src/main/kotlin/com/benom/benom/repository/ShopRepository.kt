package com.benom.benom.repository

import com.benom.benom.model.shop.Shop
import org.springframework.data.jpa.repository.JpaRepository

interface ShopRepository : JpaRepository<Shop, String> {

    fun existsByName(name: String): Boolean
}