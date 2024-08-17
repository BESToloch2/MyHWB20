package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input= new Scanner(System.in);

        // Print prompt for user to enter gender
        System.out.println("Please enter your gender: M or F.");
        // Capture the gender input
        String gender=input.next();

        // Print prompt for user to enter age
        System.out.println("Please enter your age");
        // Capture the age input
        int age= input.nextInt();
        // Classify based on gender and age
        if(age>=25){
            if(gender.equalsIgnoreCase("M")){
            System.out.println("Man");
            }else{
                System.out.println("Woman");
            }
        }else{
            if(age<25){
                if(gender.equalsIgnoreCase("M")){
                    System.out.println("Boy");
                }else{
                    System.out.println("Girl");
                }
            }
        }
        // If age is above 25
        //    If gender is "F", print "Woman"
        //    Otherwise, print "Man"
        // If age is 25 or below
        //    If gender is "F", print "Girl"
        //    Otherwise, print "Boy"
    }
}
