package com.benom.benom.repository

import com.benom.benom.model.contstants.Province
import org.springframework.data.jpa.repository.JpaRepository

interface ProvinceRepository: JpaRepository<Province, String>