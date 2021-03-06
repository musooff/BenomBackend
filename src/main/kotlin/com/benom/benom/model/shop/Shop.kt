package com.benom.benom.model.shop

import com.benom.benom.model.merchant.Merchant
import com.benom.benom.model.product.Product
import javax.persistence.*

@Entity
data class Shop(
    val name: String,
    val domain: String? = null,

    @Column(name = "featured_products")
    val featuredProducts: ArrayList<Product> = ArrayList(),

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    val address: Address,

    @OneToOne
    @JoinColumn(name = "merchant_id", referencedColumnName = "id")
    val merchant: Merchant,

    @Column(name = "phone_number")
    val phoneNumber: String,
    val password: String,
    val email: String? = null,
    val website: String? = null,
    @Id
    @GeneratedValue
    var id: Long = 0
)