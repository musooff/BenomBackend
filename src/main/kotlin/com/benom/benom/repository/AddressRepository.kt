package com.benom.benom.repository

import com.benom.benom.model.shop.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, String>