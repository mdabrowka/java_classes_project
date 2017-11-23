package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Ingredient;
import com.example.marta.mariosrestaurant.dishes.Menu;
import com.example.marta.mariosrestaurant.dishes.MenuItem;
import com.example.marta.mariosrestaurant.dishes.Menuable;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by marta on 18/11/2017.
 */

public class MenuTest {
    MenuItem item1, item2, item3, item4;
    Menu menu;
    Ingredient pasta, sauce, garlic, dough;


    @Before
    public void before() {
        menu = new Menu();
        item1 = new Dish("Pasta", 12);
        item2 = new Dish("Pizza", 12);
        item3 = new Dish("Tomato", 12);
        item4 = new Dish("Potato", 12);
        pasta = new Ingredient("pasta", 1);
        sauce = new Ingredient("tomato", 1);
        garlic = new Ingredient("garlic", 3);
        dough = new Ingredient("dough", 4);
        item1.addIngredient(pasta);
        item1.addIngredient(sauce);
        item1.addIngredient(garlic);
        item2.addIngredient(dough);
        item2.addIngredient(garlic);
    }


    @Test
    public void testMenuStartsEmpty() {
        assertEquals(0, menu.dishCount());
    }

    @Test
    public void testCanAddToMenu() {
        menu.addToTheMenu(item1);
        assertEquals(1, menu.dishCount());
    }

    @Test
    public void testCanRemoveFromMenu() {
        menu.addToTheMenu(item1);
        menu.addToTheMenu(item2);
        menu.addToTheMenu(item3);
        menu.removeFromTheMenu(item1);
        assertEquals(2, menu.dishCount());
    }

    @Test
    public void testCanCheckIfTheItemIsOnTheMenu() {
        menu.addToTheMenu(item1);
        menu.addToTheMenu(item2);
        menu.addToTheMenu(item3);
        assertEquals(true, menu.checkIfItemOnTheMenu(item1));
    }

    @Test
    public void testCanCheckThatTheItemIsNotOnTheMenu() {
        menu.addToTheMenu(item1);
        menu.addToTheMenu(item2);
        menu.addToTheMenu(item3);
        menu.removeFromTheMenu(item1);
        assertEquals(false, menu.checkIfItemOnTheMenu(item4));
    }

    @Test
    public void testCanRemoveMenuItemWhenIngredient86() {
        menu.addToTheMenu(item1);
        menu.addToTheMenu(item2);
        menu.removeMenuItemIfIngredient86();
        assertEquals(1, menu.dishCount());
    }
}
