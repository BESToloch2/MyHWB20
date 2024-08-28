package org.example.e130;

public class E130StaticKeyword {
    static void misteryMethod(int[]arr){
        for (int ar:arr){
            if (ar%2==0){
                System.out.print(ar/2);
                System.out.print(" ");
            }else{
                System.out.print(ar*10);
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
    misteryMethod(arr);
    }
}
