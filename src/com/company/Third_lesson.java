package com.company;

import java.util.Arrays;
import java.util.Scanner;

//все хорошо!
public class Third_lesson {
    public static void main(String[] args) {
        // Task 1
        int arr[] = new int[5];
        Scanner num = new Scanner(System.in);
        int user_num;
        for (int i = 0; i < 5; i++){
            System.out.print("Enter Number: ");
            user_num = num.nextInt();
            arr[i] = user_num;

        }
        for (int i = 0; i < 5; i++){
            if ( arr[i] % 2 == 0 )
                System.out.println("Number is even: " + arr[i]);
            else
                System.out.println("Number is odd " + arr[i]);
        }
        // Task 2
        Scanner str = new Scanner(System.in);
        System.out.print("Enter string to encrypt: ");
        String caesar = str.nextLine();
        System.out.print("Enter character shift: ");
        int shift = str.nextInt();
        String output = "";
        char[] ch = caesar.toCharArray();
        for (char c : ch) {
            output+= (c+=shift);
        }
        System.out.println("Original message is: " + caesar);
        System.out.println("Encrypted word is: " + output + " With key " + shift);



    }
}
