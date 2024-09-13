package org.example.e154;

class Appliance{
   // private int wattage;
    Appliance(){
        System.out.println("Appliance Constructor without argument");
    }
    Appliance(int wattage){
        System.out.println("Wattage: "+wattage);
    }
}

class WashingMachine extends Appliance{
    WashingMachine(){
        System.out.println("WashingMachine Constructor without argument");
    }

    WashingMachine(int wattage, int capacity){
        super(wattage);
        System.out.println("Capacity: "+capacity);
    }
}

public class E154SuperKeyword {
    public static void main(String[] args) {
        WashingMachine wm1=new WashingMachine();
        WashingMachine wm2=new WashingMachine(500,7);

    }
}
