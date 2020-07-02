package com.dietProject;

import javafx.beans.binding.MapExpression;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class Meal {


    private String name;

    private int kcal;
    private int protein;
    private int fat;
    private int carbs;

   /*private HashMap<Ingredient, Integer> ingredients;


    private double kcal(Map ingredients) {
        int sum = 0;
        for (Ingredient ingredient  : ingredients.keySet()) {
            sum += ingredient.getKcal()*ingredients.get(Ingredient);
        }
        return sum;
    }




    private double protein(List<Ingredient> ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) {
            sum += ing.getProtein();
        }

        return sum;
    }

    private double carb(List<Ingredient> ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) {
            sum += ing.getCarb();
        }

        return sum;
    }

    private double fat(List<Ingredient> ingredients) {
        int sum = 0;
        for (Ingredient ing : ingredients) {
            sum += ing.getFat();
        }

        return sum;
    }*/

}
