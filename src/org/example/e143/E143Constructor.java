package org.example.e143;

class Car{
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Car(String make,String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
        Car(String make,String model, int topSpeed, double price){
            this.make = make;
            this.model = model;
            this.numberOfDoors = 4;
            this.topSpeed = topSpeed;
            this.price = price;
        }

    Car(int numberOfDoors, int topSpeed, double price){
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    Car(String make,String model, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0;
    }

    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}

public class E143Constructor {
    public static void main(String[] args) {
        Car c1=new Car("Toyota", "Prius", 4, 120, 30000.0);
        Car c2=new Car("Toyota", "Prius", 120, 30000.0);
        Car c3=new Car(4, 120, 30000.0);
        Car c4=new Car("Toyota", "Prius", 4);
        c1.display();
        c2.display();
        c3.display();
        c4.display();

    }
}


