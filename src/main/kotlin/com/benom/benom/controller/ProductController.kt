package com.benom.benom.controller

import com.benom.benom.model.product.Product
import com.benom.benom.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController {

    @Autowired
    lateinit var repository: ProductRepository

    @GetMapping
    fun getProduct(@RequestParam id: String): Product = repository.findById(id).get()

    @GetMapping("/all")
    fun getAllProducts(): List<Product> = repository.findAll()

    @PostMapping("create")
    fun createProduct(@RequestBody product: Product): Product = repository.save(product)
}