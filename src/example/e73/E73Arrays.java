package example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input=new Scanner(System.in);

        // Create an array of integers that will store 5 elements
        int[] elements=new int[5];

        // Use a loop to read 5 integers from the user and store them in the array
        for (int i=0; i<5;i++){
            elements[i]=input.nextInt();
        }
        for (int j=4;j>=0;j--){
            System.out.println(elements[j]);
        }
    }
}
