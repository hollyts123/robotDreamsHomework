package com.ua.homework6;
import java.util.Scanner;

public class PrintSymbol {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a symbol: ");
        String symbol = myObj.nextLine();
        System.out.println("Enter a number: ");
        int userNumber = myObj.nextInt();
        printSymbol(symbol, userNumber);
    }

    static void printSymbol(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    }
}
