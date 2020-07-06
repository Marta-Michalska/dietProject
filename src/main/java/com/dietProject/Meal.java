package com.dietProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {


    private String name;

    private int id;
    private String recepieURL;

    private int kcal;
    private int protein;
    private int fat;
    private int carbs;
    private String url;


}
