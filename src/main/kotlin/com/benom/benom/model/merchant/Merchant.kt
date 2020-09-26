package com.benom.benom.model.merchant

import javax.persistence.*

@Entity
data class Merchant(
    @Id
    val id: String,
    @Column(name = "first_name")
    val firstName: String,
    @Column(name = "last_name")
    val lastName: String
)