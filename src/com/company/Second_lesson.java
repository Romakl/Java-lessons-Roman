package com.company;

import java.util.Scanner;

//по тому коду что есть - все хорошо
//нет решения с циклами while и do-while
//нет проверки на длину имени < 2 или > 10
public class Second_lesson {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second;
        System.out.print("First num: ");
        first = num.nextFloat();
        if (first > 100 || first < 1)
            System.out.println("Error: invalid Number");
        else if (first >= 75)
            System.out.println("Nice Job");
        else if (first >= 26)
            System.out.println("Lower average");
        else if (first >= 1)
            System.out.println("Try harder");
        String[] names = {"John", "Bob", "Mary", "Peter", "Sarah"};
        for (var i = 0; i < names.length; i++){
            if (names[i].length()> 4) {
                System.out.println("The name " + names[i] + " is longer than 4 letters");
            } else if (names[i].length() < 4)
                System.out.println("The name " + names[i] + " is shorter than 4 letters");
            else if (names[i].length() == 4)
                System.out.println("The name " + names[i] + " is 4 letters length");
        }
    }
}
