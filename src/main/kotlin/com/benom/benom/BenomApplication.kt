package com.benom.benom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BenomApplication

fun main(args: Array<String>) {
    runApplication<BenomApplication>(*args)
}
