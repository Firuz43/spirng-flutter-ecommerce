package com.example.ecommerce.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecommerce.model.Product;

@RestController
public class ProductController {
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return Arrays.asList(
            new Product(1L, "Laptop", 1200.00, "Powerfull gaming laptop", "https://example.com/laptop.jpg"),
            new Product(2L, "Phone", 800.0, "Latest smartphone model", "https://example.com/phone.jpg"),
            new Product(3L, "Headphones", 150.0, "Noise-cancelling headphones", "https://example.com/headphones.jpg")
        );
    }
}
