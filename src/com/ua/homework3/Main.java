package com.ua.homework3;

public class Main {
    public static void main(String[] args) {
        String greeting = "Hello world!";
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        char firstLetter = greeting.charAt(0);
        System.out.println(firstLetter);
        char lastLetter = greeting.charAt(greeting.length() - 1);
        System.out.println(lastLetter);
    }
}
