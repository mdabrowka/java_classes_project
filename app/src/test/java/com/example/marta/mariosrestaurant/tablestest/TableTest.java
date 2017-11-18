package com.example.marta.mariosrestaurant.tablestest;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Drink;
import com.example.marta.mariosrestaurant.dishes.MenuItem;
import com.example.marta.mariosrestaurant.tables.Patron;
import com.example.marta.mariosrestaurant.tables.Table;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class TableTest {
    Patron patron1, patron2, patron3, patron4;
    Table table101;
    MenuItem item1, item2, item3, item4;

    @Before
    public void before() {
        patron1 = new Patron("Terry", 300);
        patron2 = new Patron("Frankie", 400);
        patron3 = new Patron("Rory", 100);
        patron4 = new Patron("Mary", 100);
        table101 = new Table(3);
        item1 = new Dish("Pizza", 14);
        item2 = new Drink("White wine", 6);
        item3 = new Dish("Pasta", 12);
        item4 = new Drink("Red wine", 8);
    }


    @Test
    public void testTableStartsEmpty() {
        assertEquals(0, table101.tableSize());
    }

    @Test
    public void testCanAddGuestToTable() {
        table101.addGuest(patron1);
        assertEquals(1, table101.tableSize());
    }

    @Test
    public void testCanRemoveGuestFromTable() {
        table101.addGuest(patron1);
        table101.addGuest(patron2);
        table101.addGuest(patron3);
        table101.removeGuest(patron3);
        assertEquals(2, table101.tableSize());
    }

    @Test
    public void testCannotExceedTablesCapacity() {
        table101.addGuest(patron1);
        table101.addGuest(patron2);
        table101.addGuest(patron3);
        table101.addGuest(patron4);
        assertEquals("Sorry, this table is full", table101.addGuest(patron4));

    }

    @Test
    public void testCanCalculateTableTotal() {
        table101.addGuest(patron1);
        table101.addGuest(patron2);
        table101.addGuest(patron3);
        patron1.orderFromMenu(item1);
        patron1.orderFromMenu(item2);
        patron2.orderFromMenu(item3);
        patron2.orderFromMenu(item4);
        patron3.orderFromMenu(item1);
        patron3.orderFromMenu(item4);
        assertEquals(62, table101.totalValue());
    }



}
