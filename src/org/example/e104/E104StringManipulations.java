package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        //write code from here
        System.out.println("Enter 5 names:");
        for (int i = 0; i < arr.length; i++) {
            String names=input.nextLine();
            arr[i]=names;
        }
        for (String n:arr){
            System.out.println(n.substring(0, 3));
        }

    }
}


