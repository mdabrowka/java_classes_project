package com.example.marta.mariosrestaurant;

import com.example.marta.mariosrestaurant.tables.Patron;
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
        this.tables = new ArrayList<>();
    }


    public int tablesCount() {
        return tables.size();
    }


    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public void addToBudget(int cash) {
        this.budget += cash;
    }

    public void addTable(Table table) {
        tables.add(table);
   }
}
