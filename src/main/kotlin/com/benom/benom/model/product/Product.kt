package com.benom.benom.model.product

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Product(
    val title: String,
    val quantity: Int,
    val price: Float,
    val currency: String,
    @Column(name = "original_price")
    val originalPrice: Float,
    @Column(name = "short_description")
    val shortDescription: String,
    val description: ArrayList<Description>,
    val thumbnail: String,
    val featuredImages: ArrayList<String>,
    @Column(name = "shop_id")
    val shopId: String,
    @Column(name = "merchant_id")
    val merchantId: String,
    @Id
    @GeneratedValue
    var id: Long = 0
)