package com.company.objects;

import javax.xml.namespace.QName;

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

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
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
