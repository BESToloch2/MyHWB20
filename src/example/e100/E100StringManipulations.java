package example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input= new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In:");
        // Read the input string
        String str=input.nextLine();
        // Use a for loop to reverse the string

        for (int i =str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        // Print the reversed string

    }
}
