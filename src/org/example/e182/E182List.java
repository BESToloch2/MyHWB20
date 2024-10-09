package org.example.e182;


import java.util.LinkedList;


public class E182List {


    public static boolean isPrime(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
        public static void main (String[]args){

            LinkedList<Integer> primeNums = new LinkedList<>();
            for (int i = 2; i < 101; i++) {
                if (isPrime(i)){
                    primeNums.add(i);
                }
            }
            System.out.println(primeNums);
        }
    }