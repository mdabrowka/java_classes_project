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

//    @Test
//    public void testCanAddToPantry() {
//        pantry.addToStock(beef, 15);
//        assertEquals(true, pantry.containsIngredient(beef));
//    }
//
//    @Test
//    public void testReturnsFalseIfNoIngredient() {
//        pantry.addToStock(beef, 15);
//        assertEquals(false, pantry.containsIngredient(ham));
//    }
//
//    @Test
//    public void testCanReturnTheNumerOfPortions() {
//        pantry.addToStock(beef, 15);
//        assertEquals();
//    }
//
//    @Test
//    public void testCanRemoveAPortionFromThePantry() {
//        pantry.addToStock(beef, 15);
//        pantry.removeFromStock(beef, 2);
//        assertEquals(13, pan);
//    }
}
