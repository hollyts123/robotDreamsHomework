package com.ua.homework5;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = myObj.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        for (int i = 0; i < number; i++) {
            System.out.println(firstNum);
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            if (firstNum > 100) {
                break;
            }
        }
    }
}