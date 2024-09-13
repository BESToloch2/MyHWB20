package org.example.e164;
abstract class Vehicle {
    abstract void startEngine();

    void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}

class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
    void startEngine(String keyType){
        System.out.println("Car engine started with a "+keyType);
    }
}

public class E164AbstractClass {
    public static void main(String[] args){
        Car c1=new Car();
        c1.startEngine();c1.startEngine("smart key");c1.stopEngine();
    }
}


