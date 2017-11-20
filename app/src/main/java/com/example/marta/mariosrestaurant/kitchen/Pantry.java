package com.example.marta.mariosrestaurant.kitchen;

import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by marta on 20/11/2017.
 */

public class Pantry {
    //private ArrayList<Ingredient> pantry;
    private HashMap<Ingredient, Integer> stock;


    public Pantry() {
       // this.pantry = new ArrayList<Ingredient>();
        this.stock = new HashMap<Ingredient, Integer>();
    }


    public void addToStock(Ingredient ingredient, Integer integer) {
        stock.put(ingredient, integer);
    }


    public boolean containsIngredient(Ingredient ingredient) {
       if (stock.containsKey(ingredient));
        return true;
    }
}
