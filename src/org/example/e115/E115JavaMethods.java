package org.example.e115;

public class E115JavaMethods {

    static public void convertToUpper(String str){
        System.out.println(str.toUpperCase());

    }
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result
        convertToUpper("test");
    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
