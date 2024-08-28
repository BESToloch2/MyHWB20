package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);

        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the coffee type input
        int coffeeType= input.nextInt();
        double cost;
        switch (coffeeType){
            case 1:
                cost=3.00;
                System.out.println("The price of your coffee is $ "+cost);
                break;
            case 2:
                cost=4.00;
                System.out.println("The price of your coffee is $ "+cost);
                break;
            case 3:
                cost=4.50;
                System.out.println("The price of your coffee is $ "+cost);
                break;
            case 4:
                cost=5.00;
                System.out.println("The price of your coffee is $ "+cost);
                break;
            default:
                System.out.println("Invalid coffee type entered");
        }
    }
}
