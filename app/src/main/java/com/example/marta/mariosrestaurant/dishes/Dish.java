package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Dish<Ingredient> {
    private String name;
    private int price;
    private ArrayList<Ingredient> ingredients;


    public Dish(String name, int price, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<Ingredient>();
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public ArrayList getIngredients() {
        return this.ingredients;
    }

}
