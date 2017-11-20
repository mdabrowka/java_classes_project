package com.example.marta.mariosrestaurant;

import com.example.marta.mariosrestaurant.dishes.Dish;
import com.example.marta.mariosrestaurant.dishes.Drink;
import com.example.marta.mariosrestaurant.dishes.MenuItem;
import com.example.marta.mariosrestaurant.tables.Patron;
import com.example.marta.mariosrestaurant.tables.Table;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class RestaurantTest {
    Restaurant restaurant;
    Table table101, table102, table103;
    Patron patron1, patron2, patron3;
    MenuItem item1, item2, item3, item4;

    @Before
    public void before() {
    restaurant = new Restaurant("Unter den Linden", 0);
    table101 = new Table(4);
    table102 = new Table(4);
    table103 = new Table(12);
    patron1 = new Patron("Valeria");
    patron2 = new Patron("Gustavo");
    patron3 = new Patron("Pablo");
    item1 = new Dish("Pizza", 14);
    item2 = new Drink("White wine", 6);
    item3 = new Dish("Pasta", 12);
    item4 = new Drink("Red wine", 8);
    table101.addGuest(patron1);
    table101.addGuest(patron2);
    table103.addGuest(patron3);
    patron1.orderFromMenu(item1);
    patron1.orderFromMenu(item2);
    patron2.orderFromMenu(item3);
    patron2.orderFromMenu(item4);
    patron3.orderFromMenu(item1);
    patron3.orderFromMenu(item4);


    }

    @Test
    public void canGetName() {
        assertEquals("Unter den Linden", restaurant.getName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(0, restaurant.getBudget(), 0.0);
    }

    @Test
    public void canAddToBudget() {
        restaurant.addToBudget(300);
        assertEquals(300, restaurant.getBudget());
    }

    @Test
    public void canAddTables() {
        restaurant.addTable(table101);
        assertEquals(1, restaurant.tablesCount());
    }

    @Test
    public void canCountTables() {
        restaurant.addTable(table101);
        restaurant.addTable(table102);
        restaurant.addTable(table103);
        assertEquals(3, restaurant.tablesCount());
    }

    @Test
    public void canAcceptPayment() {
        restaurant.acceptPayment(table101);
        assertEquals(40, restaurant.getBudget(), 0.0);
    }




}









