package com.example.marta.mariosrestaurant;

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

    @Before
    public void before() {
    restaurant = new Restaurant("Unter den Linden", 0);
    table101 = new Table(4);
    table102 = new Table(4);
    table103 = new Table(12);
    patron1 = new Patron("Valeria");
    patron2 = new Patron("Gustavo");
    patron3 = new Patron("Pablo");

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




}









