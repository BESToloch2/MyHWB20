package example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");
        // Read the input string
        String string = input.nextLine();

        // Remove all spaces and convert the string to lowercase
        String mod = string.replaceAll(" ", "").toLowerCase();

        StringBuffer sb = new StringBuffer(mod);
        sb=sb.reverse();
        String convsb= sb.toString();
        // Check if the string is a palindrome
        if (convsb.equals(mod)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
