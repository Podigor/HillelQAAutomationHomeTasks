package com.hometasks.lesson5;

import java.util.Scanner;

public class CalculatorUtils {
    public static double inputNumberValidation(Scanner scr) { // This method validates input to accept only numbers
        while (!scr.hasNextDouble()) {
            System.out.println("Only numbers are allowed. Please try again");
            scr.next();
        }
        return scr.nextDouble();
    }
    public static void convertResult(double result) { // This method removes decimal part if it contains only zeros
        int convertedResult = (int) result;
        if(convertedResult == result) {
            System.out.println("The result is: " + convertedResult);
        } else {
            System.out.println("The result is: " + result);
        }
    }
    public static double sum(double n, double m) {
        return n + m;
    }

    public static double sub(double n, double m) {
        return n - m;
    }

    public static double mult(double n, double m) {
        return n * m;
    }

    public static double div(double n, double m) {
        if (m == 0) {
            System.out.println("You can't divide by zero. Program is terminated");
            System.exit(0);
        }
        return n / m;
    }
    public static double percent(double n, double m) {//Calculates percentage of the second number from the first number
        return (m*100)/n;
    }
}
