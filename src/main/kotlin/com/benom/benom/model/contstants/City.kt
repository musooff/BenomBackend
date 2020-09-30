package com.benom.benom.model.contstants

import javax.persistence.*

@Entity
data class City(
    val name: String,
    @Id
    @GeneratedValue
    var id: Long = 0
)