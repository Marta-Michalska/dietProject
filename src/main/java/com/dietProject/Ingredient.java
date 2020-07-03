package com.dietProject;

import com.dietProject.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Ingredient {

    private String name;

    private int kcal;
    private int protein;
    private int carb;
    private int fat;

    private Unit unit;
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
