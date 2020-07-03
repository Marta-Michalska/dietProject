package com.dietProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    List<Meal> meals = new ArrayList<>();
    List<Meal> day = new ArrayList<>();





    @GetMapping("/")
    public String index() {

        return ("index");
    }


    @GetMapping(value = "/meal_list")
    public String mealList(Model model) {
        //TODO podpiać wyszukiwanie z API, zamiast listy "meals"
        meals.add(new Meal("Zupa", 250, 15, 10, 20));
        meals.add(new Meal("Spaghetti", 600, 20, 20, 20));
        meals.add(new Meal("Kanapka", 200, 10, 20, 10));
        System.out.println(meals.toString());
        model.addAttribute("mealList", meals);
        model.addAttribute("request", new Request());
        return ("/meal_list");
    }

    @GetMapping(value = "/day")
    public String day(Model model) {
        model.addAttribute(day);
        return ("/day");
    }

    @PostMapping(value = "/search")
    public String search(@ModelAttribute(value = "request" ) Request request, Model model) {

        System.out.println(request.toString());


        model.addAttribute("mealList", meals);
        return ("/meal_list");
    }

    @PostMapping(value = "/addMeal")
    public String addMeal(@RequestParam(value = "meal") Meal meal, Model model) {
        day.add(meal);
        model.addAttribute(day);

        return ("/day");
    }


}
