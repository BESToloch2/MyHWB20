package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args){

        LinkedList<Integer>empAge=new LinkedList<>();
        empAge.add(30);
        empAge.add(35);
        empAge.add(40);
        empAge.add(45);
        empAge.add(50);
        empAge.add(55);
        empAge.add(60);
        empAge.add(15);
        empAge.add(100);
        empAge.removeIf(x->x>60||x<25);
        Collections.sort(empAge);
        double totalAge=0.0;
        for (int a:empAge){
            totalAge+=a;
        }
        double avgAge=totalAge/empAge.size();
        System.out.println("Remaining ages: "+empAge);
        System.out.println("Average age: "+avgAge);
    }

}
