package org.example.e176;


import java.util.ArrayList;

public class E176List {
    public static void main(String[] args){
        ArrayList<Integer> prodIDs=new ArrayList<>();
        prodIDs.add(111);
        prodIDs.add(222);
        prodIDs.add(333);
        prodIDs.add(444);
        prodIDs.add(555);
        prodIDs.add(666);
        System.out.println(prodIDs);
        prodIDs.clear();
        System.out.println(prodIDs);
    }

}
