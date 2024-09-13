package org.example.e166;
interface Controllable{
    void tornOn();
}
interface Configurable{
    void configure();
}
class SmartHomeDevice implements Controllable, Configurable{
    @Override
    public void tornOn() {
        System.out.println("Turning on Smart Home Device");
    }

    @Override
    public void configure() {
        System.out.println("Configuring Smart Home Device settings");
    }
}
public class E166MultipleInterface {

    public static void main(String[] args) {
        SmartHomeDevice sh=new SmartHomeDevice();
        sh.tornOn();
        sh.configure();

    }
}

