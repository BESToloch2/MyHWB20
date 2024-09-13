package org.example.e153;

class Vehicle{
    Vehicle(){
        System.out.println("This is the Vehicle constructor");
    }
}

class Car extends Vehicle{
    Car(){
        super();
    }
}
public class E153SuperKeyword {
    public static void main(String[] args) {
    Car c1=new Car();
    }
}
