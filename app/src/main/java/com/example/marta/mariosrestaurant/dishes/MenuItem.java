package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public abstract class MenuItem implements Menuable {
    private String name;
    private double price;
    private ArrayList<Ingredient> ingredients;


    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<Ingredient>();
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList getIngredients() {
        return this.ingredients;
    }




}
