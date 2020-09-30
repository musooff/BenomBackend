package com.benom.benom.model.contstants

import javax.persistence.*

@Entity
data class Province(
    val name: String,
    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "city_id")
    val cities: List<City>,
    @Id
    @GeneratedValue
    var id: Long = 0
)