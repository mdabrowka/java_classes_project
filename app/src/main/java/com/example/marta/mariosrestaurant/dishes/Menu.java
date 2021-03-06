package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Menu<MenuItem> {
    private ArrayList<MenuItem> menuOptions;


    public Menu() {
        this.menuOptions = new ArrayList();
    }

    public int dishCount() {
        return menuOptions.size();
    }


    public void addToTheMenu(MenuItem item) {
        menuOptions.add(item);
    }

    public void removeFromTheMenu(MenuItem item) {
        menuOptions.remove(item);
    }


    public boolean checkIfItemOnTheMenu(MenuItem item) {
        return menuOptions.contains(item);
    }

    public ArrayList getMenuItems() {
        return new ArrayList<MenuItem>(menuOptions);
    }

//    public void removeMenuItemIfIngredient86() {
//        for (MenuItem item : menuOptions) {
//            if (item.checkIIngredientIsAvailable() == false);
//            removeFromTheMenu(item);
//        }
//    }

}
