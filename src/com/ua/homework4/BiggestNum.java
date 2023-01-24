package com.ua.homework4;
import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = myObj.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = myObj.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " is greater than " + firstNumber);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
