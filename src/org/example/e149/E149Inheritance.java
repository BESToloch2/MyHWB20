package org.example.e149;

class Vehicle{

    private String make;
    private int year;
    Vehicle(){

    }

    Vehicle(String make, int year){
        this.make=make;
        this.year=year;
    }

    public void displayInfo(){
        System.out.println("Vehicle: "+make+", Year: "+year);
    }
}

class Car extends Vehicle{
    private String model;
    Car(){
    }
    Car(String make, int year, String model){
        super(make,year);
        this.model=model;

    }

    public void displayCarInfo(){
        displayInfo();
        System.out.print("Model: "+model);

    }
}


public class E149Inheritance extends Car {

    public static void main(String[] args) {

        Car c1=new Car("Toyota", 2020, "Corolla");
        c1.displayCarInfo();

    }
}
