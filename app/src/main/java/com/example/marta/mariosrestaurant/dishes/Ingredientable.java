package com.example.marta.mariosrestaurant.dishes;

/**
 * Created by marta on 23/11/2017.
 */

public interface Ingredientable {

    public int ingredientCount();

    public void addIngredient(Ingredient ingredient);

    public void removeIngredient(Ingredient ingredient);

    public boolean checkIfDishContainsIngredient(Ingredient ingredient);

    public boolean checkIIngredientIsAvailable();

    public void reduceAmountOfIngredient();


}
