package com.example.marta.mariosrestaurant.tables;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.MenuItem;
import com.example.marta.mariosrestaurant.dishes.Menuable;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Patron {
    private String name;
    private int tab;
    private ArrayList<MenuItem> orderedItems;
    MenuItem dish;


    public Patron(String name) {
        this.name = name;
        this.tab = 0;
        this.orderedItems = new ArrayList<MenuItem>();
    }

    public String getName() {
        return this.name;
    }

    public int getTab() {
        return this.tab;
    }

    public int getNumberOfOrderedItems() {
        return orderedItems.size();
    }

    public void orderFromMenu(MenuItem dish) {
        orderedItems.add(dish);
    }

    public int calculateTotalShare() {
        int total = 0;
        for (MenuItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void payBill() {
       int total = calculateTotalShare();
        tab -= total;
    }


}




