package com.dietProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    List<Meal> meals = new ArrayList<>();
    List<Meal> dayList = new ArrayList<>();
    Day day = new Day();
    HttpService httpService = new HttpService();
    URLbuilder urlbuilder = new URLbuilder();
    JsonReader jsonreader = new JsonReader();

    @GetMapping("/")
    public String index() {

        return ("index");
    }


    @GetMapping(value = "/meal_list")
    public String mealList(Model model) {
        System.out.println(meals.toString());
        model.addAttribute("mealList", meals);
        model.addAttribute("request", new Request());
        return ("/meal_list");
    }

    @GetMapping(value = "/day")
    public String day(Model model) {
        return ("/day");
    }

    @PostMapping(value = "/search")
    public String search(@ModelAttribute(value = "request") Request request, Model model) {


//        try {
//            String json = httpService.connect(urlbuilder.searchByNutrients(request));
//            meals = jsonreader.parseMealList(json);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        meals = jsonreader.parseMealList(Config.jsonListExample);
        System.out.println(request.toString());
        model.addAttribute("mealList", meals);
        return ("/meal_list");
    }

    @PostMapping(value = "/addMeal")
    public String addMeal(@ModelAttribute(value = "meal_id") int meal_id, Model model) {
        Meal mealAdd = new Meal();

        for (Meal meal : meals) {
            if (meal.getId() == meal_id) {
                mealAdd = meal;
            }
        }
//        try {
//            String json = httpService.connect(urlbuilder.searchRecipeById(meal_id));
//            mealAdd.setRecepieURL(jsonreader.mealUrl(json));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //      mealAdd.setRecepieURL(jsonreader.mealUrl(Config.jsonByIDExample)); TODO czytanie z jsona?...

        mealAdd.setRecepieURL("https://spoonacular.com/pasta-with-garlic-scallions-cauliflower-breadcrumbs-716429");

        dayList.add(mealAdd);
        day.setMeals(dayList);
        day.updateDay();

//        day.setKcal(day.countKcal());
//        day.setProtein(day.countProtein());
//        day.setCarb(day.countCarb());
//        day.setFat(day.countFat());

        model.addAttribute("dayList", dayList);
        model.addAttribute("day", day);
        System.out.println(day.toString());

        return ("/day");
    }

    @PostMapping(value = "/deleteMeal")
    public String deleteMeal(@ModelAttribute(value = "meal_id") int meal_id, Model model) {
        Meal mealRemove = new Meal();

        for (Meal meal : meals) {
            if (meal.getId() == meal_id) {
                mealRemove = meal;
            }
        }

        dayList.remove(mealRemove);

        day.updateDay();
        model.addAttribute("dayList", dayList);
        model.addAttribute("day", day);
        System.out.println(day.toString());

        return ("/day");
    }
}
