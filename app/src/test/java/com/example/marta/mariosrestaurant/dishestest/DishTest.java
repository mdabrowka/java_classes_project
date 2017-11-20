package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.MenuItem;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class DishTest {
    Dish dish;
    ArrayList<Ingredient> ingredients;
    Ingredient ham;
    Ingredient bread;


    @Before
    public void before() {
        dish = new Dish("Ham sandwich", 5);
        ingredients = new ArrayList();
        ham = new Ingredient("ham");
        bread = new Ingredient("bread");
    }


    @Test
    public void testCanGetName() {
        assertEquals("Ham sandwich", dish.getName());
    }

    @Test
    public void testCanGetPrice() {
        assertEquals(5, dish.getPrice());
    }

    @Test
    public void testDishStartsEmpty() {
        assertEquals(0, dish.ingredientCount());
    }

//    @Test
//    public void testCanAddIngredientToDish() {
//        ingredients
//    }

}
