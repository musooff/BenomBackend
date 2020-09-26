package com.benom.benom.repository

import com.benom.benom.model.merchant.Merchant
import org.springframework.data.jpa.repository.JpaRepository

interface MerchantRepository: JpaRepository<Merchant, String>