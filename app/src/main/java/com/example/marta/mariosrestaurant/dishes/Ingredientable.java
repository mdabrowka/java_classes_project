package com.example.marta.mariosrestaurant.dishes;

import java.util.ArrayList;

/**
 * Created by marta on 23/11/2017.
 */

public interface Ingredientable {

    public ArrayList getIngredients();

    public int ingredientCount();

    public void addIngredient(Ingredient ingredient);

    public void removeIngredient(Ingredient ingredient);

    public boolean checkIfDishContainsIngredient(Ingredient ingredient);

    public boolean checkIIngredientIsAvailable();

    public void reduceAmountOfIngredient();


}
