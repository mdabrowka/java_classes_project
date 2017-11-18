package com.example.marta.mariosrestaurant.dishes;

/**
 * Created by marta on 18/11/2017.
 */

public abstract class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
