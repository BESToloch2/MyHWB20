package org.example.e178;

import java.util.ArrayList;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {
        ArrayList<String > grocery=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            String it= input.nextLine();
            if (!grocery.contains(it)){
                grocery.add(it);
            }
        }
        System.out.println("Unique grocery items:");
        grocery.forEach(x-> System.out.print(x+" "));


}
}

