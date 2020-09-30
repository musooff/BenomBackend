package com.benom.benom.repository

import com.benom.benom.model.contstants.City
import org.springframework.data.jpa.repository.JpaRepository

interface CityRepository: JpaRepository<City, String>