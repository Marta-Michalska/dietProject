package com.dietProject;

public class URLbuilder {

    public String searchByNutrients(Request request){

        String url = Config.API_URL+"findByNutrients?apiKey="+Config.API_KEY+"&minCalories="+request.getKcalMin()+"&maxCalories="+request.getKcalMax()+"&minProtein="+request.getProteinMin()+"&maxProtein="+request.getProteinMax()+"&minCarbs="+request.getCarbsMin()+"&maxCarbs="+request.getCarbsMax()+"&minFat="+request.getFatMin()+"&maxFat="+request.getFatMax()+"&number=20";

        return url;
    }
    public String searchRecipeById (int id){

        String url = Config.API_URL+id+"/information?apiKey="+Config.API_KEY;
        return url;
    }


}
