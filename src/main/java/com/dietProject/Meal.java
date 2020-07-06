package com.dietProject;

import javafx.beans.binding.MapExpression;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
