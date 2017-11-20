package com.example.marta.mariosrestaurant.tablestest;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Drink;
import com.example.marta.mariosrestaurant.dishes.MenuItem;
import com.example.marta.mariosrestaurant.tables.Patron;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class PatronTest {
    String name;
    Patron patron;
    ArrayList<MenuItem> orderedItems;
    MenuItem item1, item2;

    @Before
    public void before() {
        patron = new Patron("Marion");
        orderedItems = new ArrayList<MenuItem>();
        item1 = new Dish("Spagboll", 12);
        item2 = new Drink("Coca-Cola", 2);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Marion", patron.getName());
    }

    @Test
    public void testCanGetBudget() {
        assertEquals(200, patron.getTab());
    }

    @Test
    public void testCanPlaceOrder() {
        patron.orderFromMenu(item1);
        patron.orderFromMenu(item2);
        assertEquals(2, patron.getNumberOfOrderedItems());
    }

    @Test
    public void testCanCalculateTotal() {
        patron.orderFromMenu(item1);
        patron.orderFromMenu(item1);
        assertEquals(24, patron.calculateTotalShare(), 0.0);
    }

    @Test
    public void testCanPayBill() {
        patron.orderFromMenu(item1);
        patron.orderFromMenu(item2);
        patron.payBill();
        assertEquals(186, patron.getTab());
    }

}
