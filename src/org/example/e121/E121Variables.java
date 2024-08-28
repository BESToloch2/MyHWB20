package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int num;
    double doub;
    char ch;
    void info(){
        System.out.println(num);
        System.out.println(doub);
        System.out.println(ch);
    }
    public static void main(String[] args) {
        E121Variables a =new E121Variables();
        a.num=10;
        a.doub=10.23;
        a.ch='a';
        E121Variables s =new E121Variables();
        s.num=10;
        s.doub=10.23;
        s.ch='s';
        a.info();
        s.info();
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
