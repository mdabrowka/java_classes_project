package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Ingredient;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by marta on 18/11/2017.
 */

public class IngredientTest {
    Ingredient beef;

    @Before
    public void before() {
        beef = new Ingredient("beef", 20);
    }

    @Test
    public void testCanGetType() {
        assertEquals("beef", beef.getType());
    }


    @Test
    public void testCanGetNumber() {
        assertEquals(20, beef.getNumber());
    }

    @Test
    public void testCanDecreaseNumberByOne() {
        beef.decreaseNumber();
        assertEquals(19, beef.getNumber());
    }

    @Test
    public void testCanIncreaseNumberByOne() {
        beef.increaseNumber(20);
        assertEquals(40, beef.getNumber());
    }

}
