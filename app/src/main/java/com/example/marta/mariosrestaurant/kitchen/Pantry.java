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


    public void addToStock(Ingredient ingredient) {
        pantry.add(ingredient);
    }


    public boolean containsIngredient(Ingredient ingredient) {
        if (pantry.contains(ingredient) && ingredient.getNumber() >= 1) {
            return true;
        }
        return false;
    }
}