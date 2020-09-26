package com.benom.benom.model.shop

import javax.persistence.*

@Entity
data class Address(
    @Id
    val id: String,
    @Column(name = "postal_code")
    val postalCode: Int,
    val country: String,
    val province: String,
    val city: String,
    val address: String,
    val website: String? = null
)