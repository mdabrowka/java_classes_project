package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Dish extends MenuItem {
    private String name;
    private double price;
    private ArrayList<Ingredient> ingredients;


    public Dish(String name, double price) {
        super(name, price);
        this.ingredients = new ArrayList<Ingredient>();
    }


    public int ingredientCount() {
        return ingredients.size();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public boolean checkIfDishContainsIngredient(Ingredient ingredient) {
        return ingredients.contains(ingredient);
    }

}
