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

    @Override
    public int ingredientCount() {
        return ingredients.size();
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        if (ingredient.getNumber() >= 1)
        ingredients.add(ingredient);
    }

    @Override
    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public boolean checkIfDishContainsIngredient(Ingredient ingredient) {
        return ingredients.contains(ingredient);
    }

    @Override
    public boolean checkIIngredientIsAvailable() {
          for (Ingredient ingredient: ingredients) {
              if (ingredient.getNumber() >= 1);
              return true;
          }
        return false;
    }

    @Override
    public void reduceAmountOfIngredient() {
        if (checkIIngredientIsAvailable() == true)
        for (Ingredient ingredient : ingredients) {
            ingredient.decreaseNumber();
        }
    }



}
