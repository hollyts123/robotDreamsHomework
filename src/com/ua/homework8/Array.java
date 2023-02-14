package com.ua.homework8;
import java.util.Random;
import java.util.Scanner;

public class Array {

    private int getArrayLength() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return myObj.nextInt();
    }

    private final int arrayLength = getArrayLength();
    private final int[] arrayNumbers = new int[arrayLength];
    public void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(100);
            System.out.print(arrayNumbers[i] + "\t");
        }
        System.out.println("\n");
    }

    public void sortArrayToLargest() {
        System.out.println("Sorted in ascending order: ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
            System.out.print(arrayNumbers[i] + "\t");
        }
        System.out.println("\n");
    }

    public void sortArrayToSmallest() {
        System.out.println("Sorted in descending order: ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] < arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
            System.out.print(arrayNumbers[i] + "\t");
        }
        System.out.println("\n");
    }

}