package com.example.marta.mariosrestaurant.kitchen;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Ingredient;

import java.util.ArrayList;

/**
 * Created by marta on 20/11/2017.
 */

public class Kitchen {
    private Kitchen kitchen;
    private Pantry pantry;


    public Kitchen() {
        this.kitchen = new Kitchen();
        this.pantry = new Pantry();

    }

//    public Dish prepareDish(String name) {
//        dish = new Dish("dish")
//}
    // new up an instance of a dish class based on the name given? eg. "tomato pasta" passed in and
    // kitchen makes tomatoPasta = new Dish("tomato pasta", 12)???
    // dish ingredients array starts off empty
    //loop through the pantry and select items necessary to make the dish, but how do you know what's necessary?
    //would have to hardcode recipes//

//    public void prepareDish(String dishName) {
//        ingredients = new ArrayList<Ingredient>();



// }

}
