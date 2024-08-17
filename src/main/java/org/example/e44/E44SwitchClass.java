package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal(1for breakfast, 2 for lunch, 3 for dinner");
        // Capture the meal type input
        int mealType = input.nextInt();
        double price;
        switch (mealType) {

            case 1:
                price = 5.00;
                System.out.println("The price of your meal is $ " + price);
                break;
            case 2:
                price = 10.00;
                System.out.println("The price of your meal is $ " + price);
                break;
            case 3:
                price = 15.00;
                System.out.println("The price of your meal is $ " + price);
                break;
            default:
                System.out.println("Invalid meal type entered ");
        }
    }
}
