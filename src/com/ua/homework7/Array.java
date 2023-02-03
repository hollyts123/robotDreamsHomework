package com.ua.homework7;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArrayWithRandomNumbers(numbers);
        getMinValue(numbers);
        getMaxValue(numbers);
        getAverageValue(numbers);
        getTotalSum(numbers);
    }

    static void fillArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

    static void getMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        System.out.println("The smallest number is: " + minValue);
    }

    static void getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("The largest number is: " + maxValue);
    }

    static void getAverageValue(int[] arr) {
        double sum = 0;
        double averageValue;
        for (int i : arr) {
            sum += i;
        }
        averageValue = sum / arr.length;
        System.out.println("The average value is: " + averageValue);
    }

    static void getTotalSum(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        System.out.println("The total sum is: " + totalSum);
    }
}
