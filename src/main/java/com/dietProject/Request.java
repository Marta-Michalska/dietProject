package com.dietProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    //    private boolean gluten;
//    private boolean lactose;
//    private boolean sense;
    private int kcalMin;
    private int kcalMax;

    private int proteinMin;
    private int proteinMax;

    private int carbsMin;
    private int carbsMax;

    private int fatMin;
    private int fatMax;


}
