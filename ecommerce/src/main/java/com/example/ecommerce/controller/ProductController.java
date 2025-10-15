package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecommerce.model.Product;

@RestController
public class ProductController {
    @GetMapping("/api/product")
    public Product getProduct() {
        return new Product(1, "Laptop", 1200.00);
    }
}
