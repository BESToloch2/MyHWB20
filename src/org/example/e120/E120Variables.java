package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    int year;
    String school;
    String name;
    int batchNumber;

    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
        E120Variables a=new E120Variables();
        a.year=2024;
    a.school="Syntax";
    a.name="student";
    a.batchNumber=20;
        System.out.println("I am a "+a.name+" of batch "+ a.batchNumber+" studying at "+ a.school+" in the year of "+ a.year);
    }
}
