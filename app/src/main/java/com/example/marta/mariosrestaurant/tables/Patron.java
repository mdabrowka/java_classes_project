package com.example.marta.mariosrestaurant.tables;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.MenuItem;
import com.example.marta.mariosrestaurant.dishes.Menuable;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Patron {
    private String name;
    private double tab;
    private ArrayList<MenuItem> orderedItems;



    public Patron(String name) {
        this.name = name;
        this.tab = 0;
        this.orderedItems = new ArrayList<MenuItem>();
    }

    public String getName() {
        return this.name;
    }

    public double getTab() {
        return this.tab;
    }

    public int getNumberOfOrderedItems() {
        return orderedItems.size();
    }

    public void orderFromMenu(MenuItem item) {
        orderedItems.add(item);
    }

    public double calculateTotalShare() {
        double total = 0.0;
        for (MenuItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void payBill() {
       double total = calculateTotalShare();
        tab = 0;
        //set tab to zero//!!
    }

    public void requestCustomizedDish(Dish dish, Ingredient ingredient) {
        orderFromMenu(dish);
        dish.removeIngredient(ingredient);
    }


}




