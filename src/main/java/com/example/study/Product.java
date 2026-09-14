package com.example.study;

public class Product {

    private Long id;
    private String name;
    private String category;
    private int price;
    private boolean active;

    public Product(Long id, String name, String category, int price, boolean active) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public boolean isActive() {
        return active;
    }
}
