package com.hometasks.lesson5;
import java.util.Scanner;

import static com.hometasks.lesson5.CalculatorUtils.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = inputNumberValidation(scanner);

        System.out.println("Enter the second number:");
        double number2 = inputNumberValidation(scanner);

        System.out.println("Choose an operator: +, -, *, /, %");
        char symbol = scanner.next().charAt(0);

        double result = 0; // Default result is assigned

        switch (symbol) {
            case '+':
                result = sum(number1, number2);
                break;
            case '-':
                result = sub(number1, number2);
                break;
            case '*':
                result = mult(number1, number2);
                break;
            case '/':
                result = div(number1, number2);
                break;
            case '%':
                result = percent(number1, number2);
                break;
            default:
                System.out.println("Unexpected operator is entered. Program is terminated");
                System.exit(0);
                break;
        }
        convertResult(result);
    }
}
