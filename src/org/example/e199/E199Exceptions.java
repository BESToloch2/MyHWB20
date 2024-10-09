package org.example.e199;

public class E199Exceptions {

    public static void main(String[] args) {
        System.out.println("Trying to access an element...");
        int [] arr=new int[5];
    try{
        arr[6]=20;
    }catch (ArrayIndexOutOfBoundsException ob){
        System.out.println("Error: Array index is out of bounds");
    }finally {
        System.out.println("Program has finished");
    }

    }

}
