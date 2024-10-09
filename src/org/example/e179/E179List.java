package org.example.e179;

import java.util.LinkedList;

public class E179List {

    public static void main(String[] args){
        LinkedList<Integer> nums=new LinkedList<>();
        for (int i = 50; i < 101; i++) {
            nums.add(i);
        }
        LinkedList<Integer> divisibleBy3=new LinkedList<>();
        nums.forEach(x->{
            if(x%3==0){
                divisibleBy3.add(x);
            }
        });
        System.out.println(divisibleBy3);

        }


    }
