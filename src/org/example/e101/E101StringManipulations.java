package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter input:");
        String str=input.nextLine();

        for (int i = 0; i <str.length() ; i+=2) {
            System.out.println(str.charAt(i));
        }


    }
}
