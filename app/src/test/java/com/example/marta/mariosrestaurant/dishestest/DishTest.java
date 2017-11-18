package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Dish;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class DishTest {
    Dish dish;


    @Before
    public void before() {
        dish = new Dish("Ham sandwich", 5);

    }


    @Test
    public void testCanGetName() {
        assertEquals("Ham sandwich", dish.getName());
    }

    @Test
    public void testCanGetPrice() {
        assertEquals(5, dish.getPrice());
    }


}
