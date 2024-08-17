package org.example.e75;

public class E75Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        double[][] numbers = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}
        };

        // Use nested loops to iterate through the 2D array and print each value
        for (int r=0;r<numbers.length;r++){

            for (int c=0; c<numbers[r].length;c++){

                System.out.print(numbers[r][c]+" ");

            }
            System.out.println();
        }



    }
}
