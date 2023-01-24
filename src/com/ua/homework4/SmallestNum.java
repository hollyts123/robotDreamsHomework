package com.ua.homework4;
import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = myObj.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = myObj.nextInt();
        if (firstNum < secondNum) {
            System.out.println(firstNum + " is smaller than " + secondNum);
        } else if (firstNum > secondNum) {
            System.out.println(secondNum + " is smaller than " + firstNum);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
