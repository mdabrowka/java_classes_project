package com.example.marta.mariosrestaurant.tablestest;

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
    Patron patron1, patron2, patron3;
    Table table101;

    @Before
    public void before() {
        patron1 = new Patron("Terry", 300);
        patron2 = new Patron("Frankie", 400);
        patron3 = new Patron("Rory", 100);
        table101 = new Table();
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


}
