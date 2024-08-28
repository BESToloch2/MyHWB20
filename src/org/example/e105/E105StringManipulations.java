package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("In:");
        String word = inp.nextLine();
        // Use a for loop to iterate through the string and print only the vowels
        // (Your code goes here)
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.print(word.charAt(i));
            }
        }
    }
}
