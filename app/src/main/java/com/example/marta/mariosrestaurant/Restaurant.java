package com.example.marta.mariosrestaurant;

import com.example.marta.mariosrestaurant.tables.Table;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Restaurant {
    private String name;
    private int budget;
    private ArrayList<Table> tables;

    public Restaurant(String name, int budget) {
        this.name = name;
        this.budget = budget;
        this.tables = new ArrayList;
    }




}
