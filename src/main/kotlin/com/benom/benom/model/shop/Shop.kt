package com.benom.benom.model.shop

import com.benom.benom.model.product.Product
import javax.persistence.*

@Entity
data class Shop(
    @Id
    val id: String,
    val name: String,
    val domain: String? = null,
    @Column(name = "featured_products")
    val featuredProducts: ArrayList<Product> = ArrayList(),
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    val address: Address,
    @Column(name = "phone_number")
    val phoneNumber: String,
    val email: String
)