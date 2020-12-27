package com.company.objects;

public class Products {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return + id +
                ": " + name +
                "; Price: " + price +
                "; Quantity: " + quantity;
    }
}
