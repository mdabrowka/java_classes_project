package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Ingredient;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class IngredientTest {
    Ingredient ingredient;

    @Before
    public void before() {
        ingredient = new Ingredient("beef", 20);
    }

    @Test
    public void testCanGetType() {
        assertEquals("beef", ingredient.getType());
    }

}
