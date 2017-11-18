package com.example.marta.mariosrestaurant.tables;

/**
 * Created by marta on 18/11/2017.
 */

public class Patron {
    private String name;
    private int budget;


    public Patron(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return this.name;
    }

    public int getBudget() {
        return this.budget;
    }

}
