package org.example.e117;

public class E117JavaMethods {

    public static void sumEvenToX(int x) {
        int evSum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                evSum += i;
            }
        }
        System.out.println(evSum);
    }

    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        sumEvenToX(5);
    }
    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum
}
