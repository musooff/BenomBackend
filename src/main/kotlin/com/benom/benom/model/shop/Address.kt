package com.benom.benom.model.shop

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Address(
    @Column(name = "postal_code")
    val postalCode: Int,
    val province: String,
    val city: String,
    val address: String,
    @Id
    @GeneratedValue
    var id: Long = 0
)