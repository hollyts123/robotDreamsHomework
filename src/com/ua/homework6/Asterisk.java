package com.ua.homework6;
import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = myObj.nextInt();
        printStars(userNumber);
    }

    static void printStars(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
    }
}
