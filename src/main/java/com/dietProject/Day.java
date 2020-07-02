package com.dietProject;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
public class Day {

    private String day;
    private List<Meal> meals;

    private int kcal(){

        int sum = 0;
        for (Meal meal:meals){
           sum+=meal.getKcal();
        }
        return sum;
    };
    private int protein(){
        int sum = 0;
        for (Meal meal:meals){
            sum+=meal.getProtein();
        }
        return sum;
    }

    private int carb(){
        int sum = 0;
        for (Meal meal:meals){
            sum+=meal.getCarbs();
        }
        return sum;
    }
    private int fat(){
        int sum = 0;
        for (Meal meal:meals){
            sum+=meal.getFat();
        }
        return sum;
    }




}
