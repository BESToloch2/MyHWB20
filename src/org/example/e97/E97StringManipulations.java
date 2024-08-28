package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input a browser name
        System.out.println("Please enter a browser name:");
        String browser= input.nextLine();
        // Use conditional statements to print the message based on the input
        if (browser.equalsIgnoreCase("Chrome")){
            System.out.println(" Proceed with Chrome browser");
        }else if (browser.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        }else if (browser.equalsIgnoreCase("IE")){
            System.out.println("Proceed with IE browser");
        }else {
            System.out.println("Invalid browser");
        }
        // For any other input, print "Invalid browser"
    }
}
