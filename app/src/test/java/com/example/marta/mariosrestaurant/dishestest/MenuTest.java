package com.example.marta.mariosrestaurant.dishestest;

import com.example.marta.mariosrestaurant.dishes.Menu;
import com.example.marta.mariosrestaurant.dishes.Menuable;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 18/11/2017.
 */

public class MenuTest {
    Menuable item1, item2, item3, item4;
    Menu menu;


    @Before
    public void before() {
        menu = new Menu();
    }

    @Test
    public void testMenuStartsEmpty() {
        assertEquals(0, menu.dishCount());
    }


}
