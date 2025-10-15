package com.example.ecommerce.model;


public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private String imageUrl;


    public Product(int id, String name, double price, description, imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    } 

    public int getId() {
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

    private String getImageUrl() {
        return imageUrl;
    }
}
