package com.example.marta.mariosrestaurant.kitchen;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.MenuItem;

import java.util.ArrayList;

/**
 * Created by marta on 20/11/2017.
 */

public class Kitchen {
    private Kitchen kitchen;
    private Pantry pantry;




    public void prepareDish(MenuItem dish) {
        dish.reduceAmountOfIngredient();
    }


}
