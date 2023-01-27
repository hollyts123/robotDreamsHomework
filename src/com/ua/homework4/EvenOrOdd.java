package com.ua.homework4;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = myObj.nextInt();
        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " is even");
        } else {
            System.out.println(userNumber + " is odd");
        }
    }
}
