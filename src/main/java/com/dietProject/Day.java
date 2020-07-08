package com.dietProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Day {

    private List<Meal> meals;
    private int kcal;
    private int protein;
    private int fat;
    private int carbs;

    public Day(List<Meal> meals) {
        this.meals = meals;
    }

    public void updateDay() {


        kcal = 0;
        protein = 0;
        carbs = 0;
        fat = 0;

        for (Meal meal : meals) {
            kcal += meal.getKcal();
            protein += meal.getProtein();
            carbs += meal.getCarbs();
            fat += meal.getFat();
        }

    }

}