package com.example.marta.mariosrestaurant.dishes;

/**
 * Created by marta on 18/11/2017.
 */

public class Ingredient {
   private String type;
   private int number;


    public Ingredient(String type, int number) {
        this.type = type;
        this.number = number;
    }



    public String getType() {
        return this.type;
    }

    public int getNumber() {
        return this.number;
    }

    public void decreaseNumber() {
        this.number -= 1;
    }

    public void increaseNumber(int extraPortions) {
        this.number += extraPortions;
    }


}
