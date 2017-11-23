package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public abstract class MenuItem implements Menuable {
    private String name;
    private double price;


    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }



}
