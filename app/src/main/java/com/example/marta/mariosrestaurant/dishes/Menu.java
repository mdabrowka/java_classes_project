package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Menu<Menuable> {
    private ArrayList<Menuable> menuOptions;



    public int dishCount() {
      return menuOptions.size();
    }


    public void addToTheMenu(Menuable item) {
        menuOptions.add(item);
    }

    public void removeFromTheMenu(Menuable item) {
        menuOptions.remove(item);
    }


    public boolean checkIFSthIsInIt(Menuable item) {
       if menuOptions.contains(Menuable item) == true;
       return

    }



}
