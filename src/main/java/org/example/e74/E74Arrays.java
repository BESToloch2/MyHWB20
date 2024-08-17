package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);

        // Create an array of integers with a size of 5
        int[] intigers=new int[5];

        // Use a loop to read 5 integers from the user and store them in the array
        for (int i=0;i<intigers.length;i++){
            intigers[i]= input.nextInt();
        }

        for (int intiger:intigers){
            System.out.println(intiger*10);
        }
        // (Do not print any prompt message for the user)

        // Use another loop to multiply each element of the array by 10 and print the result

    }
}
