package com.example.marta.mariosrestaurant.kitchentest;

import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.kitchen.Pantry;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 20/11/2017.
 */

public class PantryTest {
    Pantry pantry;
    Ingredient beef, ham, chicken, pumpkin, garlic, mustard, rice, pasta;

    @Before
    public void before() {
        pantry = new Pantry();
        beef = new Ingredient("beef");
        ham = new Ingredient("ham");
        chicken = new Ingredient("chicken");
        pumpkin = new Ingredient("pumpkin");
        garlic = new Ingredient("garlic");
        mustard = new Ingredient("mustard");
        rice = new Ingredient("rice");
        pasta = new Ingredient("pasta");
    }


}
