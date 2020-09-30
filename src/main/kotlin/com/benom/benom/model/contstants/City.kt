package com.benom.benom.model.contstants

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class City(
    val name: String,
    @Id
    @GeneratedValue
    var id: Long = 0
)