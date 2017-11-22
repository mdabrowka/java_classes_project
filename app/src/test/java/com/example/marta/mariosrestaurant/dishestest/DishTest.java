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
        ham = new Ingredient("ham", 2);
        bread = new Ingredient("bread", 5);
    }


    @Test
    public void testCanGetName() {
        assertEquals("Ham sandwich", dish.getName());
    }

    @Test
    public void testCanGetPrice() {
        assertEquals(5.0, dish.getPrice());
    }

    @Test
    public void testDishStartsEmpty() {
        assertEquals(0, dish.ingredientCount());
    }

    @Test
    public void testCanAddIngredientToDish() {
        dish.addIngredient(ham);
        assertEquals(1, dish.ingredientCount());
    }

    @Test
    public void testCanRemoveIngredient() {
        dish.addIngredient(ham);
        dish.addIngredient(bread);
        dish.removeIngredient(bread);
        assertEquals(1, dish.ingredientCount());
    }

    @Test
    public void testReturnsTrueIfIngredientInTheDish() {
        dish.addIngredient(ham);
        assertEquals(true, dish.checkIfDishContainsIngredient(ham));
    }

    @Test
    public void testReturnsFalseIIngredientNotInTheDish() {
        dish.addIngredient(ham);
        assertEquals(false, dish.checkIfDishContainsIngredient(bread));
    }


    @Test
    public void testCanReduceIngredientNumbers() {
        dish.addIngredient(ham);
        dish.addIngredient(bread);
        dish.reduceAmountOfIngredient();
        int actual = ham.getNumber();
        int actual1 = bread.getNumber();
        assertEquals(1, actual);
        assertEquals(4, actual1);
    }

    @Test
    public void testCanCheckThatIngredientsAreAvailable() {
        dish.addIngredient(ham);
        dish.addIngredient(bread);
        dish.checkIIngredientIsAvailable();
        assertEquals(true, dish.checkIIngredientIsAvailable());
    }


}
