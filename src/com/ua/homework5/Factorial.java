package com.ua.homework5;

public class Factorial {
    public static void main(String[] args) {
        int number = 7;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
