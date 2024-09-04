package org.example.e132;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class E132StaticKeyword {
    static int [][] reduce10(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;

        int [][]newArray=new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                newArray[i][j]=arr[i][j]-10;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };

        int[][]result=reduce10(arr);

        for (int[]rows:result){
            for (int cols:rows){
                System.out.print(cols+" ");
            }
            System.out.println();
        }

    }
}

