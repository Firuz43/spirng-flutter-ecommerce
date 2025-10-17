package com.example.ecommerce.model;


public class Product {
    private Long id;
    private String name;
    private double price;
    private String description;
    private String imageUrl;


    public Product(Long id, String name, double price, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    } 

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //
    private String getImageUrl() {
        return imageUrl;
    }
}
