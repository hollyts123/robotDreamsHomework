package com.ua.homework6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = myObj.nextInt();
        int powerOfThree = getPowerOfThree(userNumber);
        System.out.println(userNumber + " raised to power of 3 equals " + powerOfThree);
    }

    static int getPowerOfThree(int a) {
        return a * a * a;
    }
}
