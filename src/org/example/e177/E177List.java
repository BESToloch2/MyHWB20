package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<String > messages=new ArrayList<>();
        System.out.println("Remaining messages:");
        for (int i = 0; i < 5; i++) {
            String m=input.nextLine();
            messages.add(m);
        }
        messages.remove(4);
        messages.remove(2);
        messages.remove(0);
        messages.forEach(x-> System.out.print(x+" "));
    }

}
