package com.patdoc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Minimum : " + findMin(array));

    }

    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integer values.\r");
        int[] values = new int[count];
        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }
    public static int findMin(int[] array){
         int min = Integer.MAX_VALUE;

         for(int i=0; i<array.length; i++){
             int value = array[i];
             if(value < min){
                 min = value;

             }
         }
         return min;
    }
}
