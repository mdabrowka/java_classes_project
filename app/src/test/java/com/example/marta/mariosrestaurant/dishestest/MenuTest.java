package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Dish;
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
    Menuable item1, item2, item3, item4;
    Menu menu;


    @Before
    public void before() {
        menu = new Menu();
        item1 = new Dish("Pasta", 12);
        item2 = new Dish("Pizza", 12);
        item3 = new Dish("Tomato", 12);
        item4 = new Dish("Potato", 12);
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

}
