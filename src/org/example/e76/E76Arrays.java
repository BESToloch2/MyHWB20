package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

        // Use nested loops to iterate through the 2D array and double the value of each element
        for (int r=0;r<a.length;r++){

            for (int c=0;c<a[r].length;c++){
                double b=a[r][c]*2;
                System.out.print(b+" ");
            }
            System.out.println();

        }

        // Use nested loops to iterate through the 2D array and print each value
    }
}
