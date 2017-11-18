package com.example.marta.mariosrestaurant.tables;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.MenuItem;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Patron {
    private String name;
    private int budget;
    private ArrayList<MenuItem> orderedItems;
    MenuItem dish;


    public Patron(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.orderedItems = new ArrayList<MenuItem>();
    }

    public String getName() {
        return this.name;
    }

    public int getBudget() {
        return this.budget;
    }

    public int getNumberOfOrderedItems() {
        return orderedItems.size();
    }

    public void orderFromMenu(MenuItem dish) {
        orderedItems.add(dish);
    }

}
