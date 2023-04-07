package com.hometasks.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayUpdateMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting array size from the user input and validation if it is integer
        System.out.println("Enter array size:");
        int s = intValueValidation(scanner);

        if (s < 1) {
            System.out.println("Array size is invalid. Good bye!");
            System.exit(0);
        }

        // Array initialization
        int[] arrayInt = new int[s];

        // Adding random elements to array
        Random rand = new Random();
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = rand.nextInt(s);
        }

        // Print all array elements to verify the results
        System.out.println("Initial array with size=" + s + " is generated with random numbers:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("-----------------------");

        System.out.println("Enter integer array element to add to the begging of the array:");
        int element = intValueValidation(scanner);
        System.out.println("Updated array with new element at position 0:");
        int[] resultedArray1 = addArrayElement(arrayInt, element);
        System.out.println(Arrays.toString(resultedArray1));
        System.out.println("-----------------------");

        System.out.println("Enter position for a new element in the initial array (position starts from 0):");
        int position = intValueValidation(scanner);
        if (position > arrayInt.length) {
            System.out.println("Element position is invalid. Good bye!");
            System.exit(0);
        }
        System.out.println("Updated array with new element at position" + position + ":");
        int[] resultedArray2 = addArrayElement(arrayInt, element, position);
        System.out.println(Arrays.toString(resultedArray2));
        System.out.println("-----------------------");
        System.out.println("The program completed successfully!");
    }

    //This method accepts array and element
    public static int[] addArrayElement(int[] arrayInitial, int element) {
        int[] arrayUpdated = new int[arrayInitial.length + 1];
        arrayUpdated[0] = element;
        for (int i = 1; i < arrayUpdated.length; i++) {
            arrayUpdated[i] = arrayInitial[i-1];
        }
        return arrayUpdated;
    }

    //This method accepts array, element and position
    public static int[] addArrayElement(int[] arrayInitial, int element, int position) {
        int[] arrayUpdated = new int[arrayInitial.length + 1];
        for (int i = 0; i < arrayUpdated.length; i++) {
            if (i < position) {
                arrayUpdated[i] = arrayInitial[i];
            } else if (i == position) {
                arrayUpdated[i] = element;
            } else
                arrayUpdated[i] = arrayInitial[i-1];
        }
        return arrayUpdated;
    }

    // This method checks if entered value is an integer
      public static int intValueValidation(Scanner scr) {
        while (!scr.hasNextInt()) {
            System.out.println("Only integer numbers are allowed. Please try again");
            scr.next();
        }
        return scr.nextInt();
    }
}