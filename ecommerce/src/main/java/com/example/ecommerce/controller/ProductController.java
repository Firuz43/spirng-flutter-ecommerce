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
            new Product(1L, "Laptop", 1200.00, "Powerfull gaming laptop", "https://store.storeimages.cdn-apple.com/1/as-images.apple.com/is/iphone-card-40-17pro-202509_FMT_WHH?wid=508&hei=472&fmt=p-jpg&qlt=95&.v=WVVFRzUzVk1oblJhbW9PbGNSU25ja3doNjVzb1FWSTVwZWJJYThYTHlrNzQzbUlIR1RvazhDRHNOQlYvM3g2dFIwdkZSSnBZYjhOaHBpM2lkYTFBUEZHTmVoMWFVZloyU3lqdmZCOUFEeDF6K2N6UFd4K21VWHNnbWZBQ3hSanQ"),
            new Product(2L, "Phone", 800.0, "Latest smartphone model", "https://images.unsplash.com/photo-1484788984921-03950022c9ef?ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8bGFwdG9wfGVufDB8fDB8fHww&fm=jpg&q=60&w=3000"),
            new Product(3L, "Headphones", 150.0, "Noise-cancelling headphones", "https://i.insider.com/68a491b6a17a8c5b405315e2?width=700")
        );
    }
}
