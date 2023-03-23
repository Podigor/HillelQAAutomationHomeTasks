package com.hometasks;

import java.util.Arrays;
import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {

        // Array size variable is created to use it for array initialization and array elements adding
        int s = 20;

        // Array initialization
        int [] arrayInt = new int[s];

        // Adding random elements to array
        Random rand = new Random();
        for(int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = rand.nextInt(s);
        }

        // Print all array elements to verify the results
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("-----------------------");

        // Filter out from arrayInt all elements with values >5 and <45
        int [] arrayIntForSum = new int[arrayInt.length];
        int j = 0; //Initial index of element in arrayIntForSum
        int sum = 0; //Initial value for sum variable
        for(int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i] > 5 && arrayInt[i] < 45) {
               arrayIntForSum[j] = arrayInt[i];
               sum += arrayIntForSum[j];
            }
            j++;
        }
        // Print array of elements with values >5 and <45
        System.out.println("Array of elements with values >5 and <45 (zero values are included):");
        System.out.println(Arrays.toString(arrayIntForSum));
        System.out.println("-----------------------");

        // Print sum of elements in arrayIntForSum
        System.out.println("Sum of array elements with values >5 and <45 (calculated using 'for' cycle) = " + sum);
        System.out.println("Sum of array elements with values >5 and <45 (calculated using sum function) = "
                + Arrays.stream(arrayIntForSum).sum());

        System.out.println("-----------------------");
        System.out.println("Even Numbers from initial array: ");
        // Print even values from arrayInt
        for(int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i] > 0 && arrayInt[i] % 2 == 0) {
                System.out.print(arrayInt[i] + " ");
            }
        }
    }
}