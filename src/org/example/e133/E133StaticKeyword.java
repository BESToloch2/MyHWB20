package org.example.e133;

public class E133StaticKeyword {
    static int count;
    static int countA(String s){
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='A'||s.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(countA("AsffqAfqaaAAw"));
    }
}

