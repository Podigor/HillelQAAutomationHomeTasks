package com.hometasks.lesson10;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Lesson10 {
    public static void main(String[] args) {
        String string = "oil, oil, sausage, milk.";
        convertString(string);
    }
    public static void convertString(String str) {
        String[] strArray = str.replace(",", "").replace(".", "").split(" ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].substring(0,1).toUpperCase() + strArray[i].substring(1);
        }
        LinkedHashSet<String> strLinkedHashSet = new LinkedHashSet <>(Arrays.asList(strArray));
        for (String s : strLinkedHashSet) {
            System.out.println(s);
        }
    }
}
