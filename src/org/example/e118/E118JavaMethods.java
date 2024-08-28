package org.example.e118;

public class E118JavaMethods {
    public static void spaceIn(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        // Students will write the code here.
        spaceIn("hello");
    }
}
