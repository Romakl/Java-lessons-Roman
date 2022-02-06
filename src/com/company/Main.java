package com.company;

import java.util.Scanner;

public class Main {
    
    // По задаче все хорощо

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second;
        System.out.print("First num: ");
        first = num.nextFloat();
        System.out.print("Second num: ");
        second = num.nextFloat();
        System.out.print("Result plus is - " + (first + second));
        System.out.println("Result minus is - " + (first - second));
        System.out.println("Result multiply is - " + (first * second));
        System.out.println("Result divide is - " + (first / second));
        System.out.println("Result remain is - " + (first % second));
        System.out.println("Results increment of first are - " + first++ + " " + "and " + ++first);
        System.out.println("Results decrement of first are - " + first-- + " " + "and " + --first);
    }
}
