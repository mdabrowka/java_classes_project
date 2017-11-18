package com.example.marta.mariosrestaurant.tables;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Table {
    private ArrayList<Patron> table;
    private int capacity;
    private Patron patron;


    public Table(int capacity) {
        this.table = new ArrayList();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int tableSize() {
        return this.table.size();
    }


    public String addGuest(Patron patron) {
        if (tableSize() < capacity)
        table.add(patron);
        else return "Sorry, this table is full";
        return null;
    }

    public void removeGuest(Patron patron) {
        table.remove(patron);
    }

    public int totalValue() {
        int total = 0;
        for (Patron patron : table) {
            total += patron.calculateTotalShare();
        }
        return total;
    }




}


