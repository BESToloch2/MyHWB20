package org.example.e128;

public class E128StaticKeyword {
    static String mixString (String s1,String s2) {
        StringBuilder mixString=new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            mixString.append(s1.charAt(i)).append(s2.charAt(i));
        }
        return mixString.toString();
    }
    public static void main(String[] args) {
        System.out.println(mixString("123456","abcdef"));
    }

}