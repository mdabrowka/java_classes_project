package com.example.marta.mariosrestaurant.tablestest;

import com.example.marta.mariosrestaurant.tables.Patron;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class PatronTest {
    String name;
    int budget;
    Patron patron;

    @Before
    public void before() {
        patron = new Patron("Marion", 200);
    }

    @Test
    public void canGetName() {
        assertEquals("Marion", patron.getName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(200, patron.getBudget());
    }

}
