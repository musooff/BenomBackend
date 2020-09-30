package com.benom.benom.model.shop

import javax.persistence.*

@Entity
data class Address(
    @Column(name = "postal_code")
    val postalCode: Int,
    val country: String,
    val province: String,
    val city: String,
    val address: String,
    val website: String? = null,
    @Id
    @GeneratedValue
    var id: Long = 0
)