package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Menu {
    private ArrayList<Menuable> menuOptions;


    public Menu() {
        this.menuOptions = new ArrayList();
    }

    public int dishCount() {
        return menuOptions.size();
    }


    public void addToTheMenu(Menuable item) {
        menuOptions.add(item);
    }

    public void removeFromTheMenu(Menuable item) {
        menuOptions.remove(item);
    }


    public boolean checkIfItemOnTheMenu(Menuable item) {
        return menuOptions.contains(item);
    }

//    public void removeMenuItemIfIngredient86() {
//        for (Dish item : menuOptions) {
//            if (Ingredient ingredient : ingredients) = 1;
//            removeFromTheMenu(item);
//        }
//    }

    //menuOptions takes in MenuItem and not Dish class, so there is a problem


}
