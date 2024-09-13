package org.example.e165;
interface ElectronicDevice{
    void turnOn();
    void turnOff();
}
class Smartphone implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }
}

class Laptop implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off");
    }
}
public class E165InterfaceClass {

    public static void main(String[] args) {
    Smartphone s1=new Smartphone();
    Laptop l1=new Laptop();

    s1.turnOn();s1.turnOff();
    l1.turnOn();l1.turnOff();

    }

}