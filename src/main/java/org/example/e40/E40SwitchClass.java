package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input= new Scanner(System.in);
        String responsibility;
        // Print prompt for user to enter the name of the instructor
        System.out.println("Enter name of the instructor");

        // Capture the instructor name input
        String instructorName= input.nextLine();
        // Determine the responsibility based on the instructor's name using a switch statement
        switch (instructorName){

            case "Asghar":
                responsibility="Will take care of Java Assignment";
                break;
            case "Moazzam":
                responsibility="Will take care of SDLC Assignments";
                break;
            case "Weqas":
                responsibility="Will take care of Selenium Assignments";
                break;
            case "Asel":
                responsibility="Will take care of every Assignments";
                break;
            default:
                responsibility="Invalid instructor selected";
        }
        // Print the responsibility
        System.out.println(responsibility);
    }
}
