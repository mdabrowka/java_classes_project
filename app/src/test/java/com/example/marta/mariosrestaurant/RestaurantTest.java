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
    Table<Patron> table101, table102, table103;
    Patron patron1, patron2, patron3;


    @Before
    public void before() {
    restaurant = new Restaurant("Unter den Linden", 0);
    table101 = new Table<Patron>();
    table102 = new Table<Patron>();
    table103 = new Table<Patron>();
    patron1 = new Patron("Valeria", 200);
    patron2 = new Patron("Gustavo", 400);
    patron3 = new Patron("Pablo", 500);

    }

    @Test
    public void canGetName() {
        assertEquals("Unter den Linden", restaurant.getName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(0, restaurant.getBudget());
    }

    @Test
    public void canAddToBudget() {
        restaurant.addToBudget(300);
        assertEquals(300, restaurant.getBudget());
    }


}









