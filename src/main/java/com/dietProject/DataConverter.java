package com.dietProject;

public class DataConverter {

    public Integer stringToInt(String string) {

        String str = "";

        for (char a : string.toCharArray()) {
            if (Character.isDigit(a)) {
                str = str + a;
            }
        }
        Integer a = Integer.parseInt(str);

        return a;
    }
}
