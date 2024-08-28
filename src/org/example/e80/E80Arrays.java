package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum=0;

        for (int r=0;r<a.length;r++){

            for (int c=0;c<a[r].length;c++){

                if (a[r][c]<0&&a[r][c]%2!=0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
