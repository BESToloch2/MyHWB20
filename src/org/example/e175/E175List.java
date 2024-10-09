package org.example.e175;

import java.util.ArrayList;
import java.util.List;


public class E175List {
    public static void main(String[] args){
       /* List<ArrayList<Integer>> products=new ArrayList<>();
        ArrayList<Integer>p1=new ArrayList<>();
        p1.add(111);
        p1.add(111);
        p1.add(111);
        products.add(p1);
        ArrayList<Integer>p2=new ArrayList<>();
        p2.add(999);
        p2.add(999);
        p2.add(999);
        products.add(p2);
        products.forEach(x-> System.out.println(x));

        */
        ArrayList<Integer> products=new ArrayList<>();
        products.add(111);
        products.add(111);
        products.add(111);
        products.add(999);
        products.add(999);
        products.add(999);
        products.forEach(x-> System.out.println(x));
    }

}
