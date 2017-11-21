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
        beef = new Ingredient("beef", 15);
        ham = new Ingredient("ham", 20);
        chicken = new Ingredient("chicken", 20);
        pumpkin = new Ingredient("pumpkin", 7);
        garlic = new Ingredient("garlic", 25);
        mustard = new Ingredient("mustard", 10);
        rice = new Ingredient("rice", 50);
        pasta = new Ingredient("pasta", 50);
    }

    @Test
    public void testPantryStartsEmpty() {
        assertEquals(0, pantry.pantrySize());
    }

    @Test
    public void testCanAddToPantry() {
        pantry.addToPantry(chicken);
        assertEquals(1, pantry.pantrySize());
    }

}
