package com.dietProject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonReader {

    DataConverter dataConverter = new DataConverter();

    public List<Meal> parseMealList(String json) {
        List<Meal> list = new ArrayList<>();
        JSONArray mealArray = new JSONArray(json);
        for (int i = 0; i < mealArray.length(); i++) {
            JSONObject jsonMeal = mealArray.getJSONObject(i);
            Meal meal = new Meal();
            meal.setName(jsonMeal.getString("title"));
            meal.setId(jsonMeal.getInt("id"));
            meal.setKcal(jsonMeal.getInt("calories"));
            meal.setProtein(dataConverter.stringToInt(jsonMeal.getString("protein")));
            meal.setFat(dataConverter.stringToInt(jsonMeal.getString("fat")));
            meal.setCarbs(dataConverter.stringToInt(jsonMeal.getString("carbs")));

            list.add(meal);
        }
        return list;
    }

    public String mealUrl(String json){
        JSONObject jsonMeal = new JSONObject(json);
        String url = jsonMeal.getString("sourceUrl");

        return url;
    }




}
