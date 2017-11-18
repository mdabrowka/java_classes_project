package com.example.marta.mariosrestaurant.tables;

import com.example.marta.mariosrestaurant.dishes.Dish;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Patron {
    private String name;
    private int budget;
    private ArrayList<MenuItem> orderedItems;
    Dish dish;


    public Patron(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.orderedItems = new ArrayList;
    }

    public String getName() {
        return this.name;
    }

    public int getBudget() {
        return this.budget;
    }

    public void orderDish(Dish dish) {


    }

}
