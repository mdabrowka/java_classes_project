package com.example.marta.mariosrestaurant.kitchentest;

import android.support.v4.media.AudioAttributesCompat;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.kitchen.Kitchen;
import com.example.marta.mariosrestaurant.kitchen.Pantry;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by marta on 20/11/2017.
 */

public class KitchenTest {
    Kitchen kitchen;
    Pantry pantry;
    Dish beefStew;
    ArrayList<Ingredient> ingredients;
    Ingredient beef, potato, carrot, garlic, mushroom;




    @Before
    public void before() {
        kitchen = new Kitchen();
        pantry = new Pantry();
        beefStew = new Dish("beef stew", 18);
        ingredients = new ArrayList<Ingredient>();
        beef = new Ingredient("beef", 20);
        potato = new Ingredient("potato", 50);
        carrot = new Ingredient("carrot", 60);
        garlic = new Ingredient("garlic", 50);
        mushroom = new Ingredient("mushroom", 30);
    }




}
