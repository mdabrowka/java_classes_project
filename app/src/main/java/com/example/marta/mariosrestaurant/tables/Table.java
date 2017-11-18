package com.example.marta.mariosrestaurant.tables;

import java.util.ArrayList;

/**
 * Created by marta on 18/11/2017.
 */

public class Table<Patron> {
    private ArrayList<Patron> table;


    public Table() {
        this.table = new ArrayList();
    }

    public int tableSize() {
        return this.table.size();
    }


    public void addGuest(Patron patron) {
        table.add(patron);
    }

    public void removeGuest(Patron patron) {
        table.remove(patron);
    }
}


