package com.benom.benom.repository

import com.benom.benom.model.product.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}