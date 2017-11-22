package com.example.marta.mariosrestaurant.kitchen;

import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marta on 20/11/2017.
 */

public class Pantry {
    private ArrayList<Ingredient> pantry;



    public Pantry() {
        this.pantry = new ArrayList<Ingredient>();
    }

    public int pantrySize() {
        return this.pantry.size();
    }

    public void addToPantry(Ingredient ingredient) {
        pantry.add(ingredient);
    }


    public boolean containsIngredient(Ingredient ingredient) {
        if (pantry.contains(ingredient) && ingredient.getNumber() >= 1) {
            return true;
        }
        return false;
    }

    public void removeFromPantry(Ingredient ingredient) {
        pantry.remove(ingredient);
    }

    public int checkIngredientLevel(Ingredient ingredient) {
       return ingredient.getNumber();
    }

    public void getDelivery(Ingredient ingredient, int deliveredNumber) {
        ingredient.increaseNumber(deliveredNumber);
    }

    public void removePortionFromPantry(Ingredient ingredient) {
        ingredient.decreaseNumber();
    }
}