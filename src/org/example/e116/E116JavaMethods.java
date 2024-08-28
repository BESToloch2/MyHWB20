package org.example.e116;

public class E116JavaMethods {

    public static void bothEven(int a, int b){
        if (a%2==0&&b%2==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        bothEven(1234, 12);
        // Call the bothEven method with various arguments to test the method
    }

    // Create method bothEven with two integer parameters
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
