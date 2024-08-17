package example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp=new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Enter:");
        String str= inp.nextLine();
        // Use a for loop to iterate through the string and print each character on a separate line
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
