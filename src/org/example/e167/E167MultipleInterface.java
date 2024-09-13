package org.example.e167;

interface BaseDeviceInterface{
  public   void basicFunctionality();
}

interface AdvancedDeviceInterface extends BaseDeviceInterface{
  public   void advancedFunctionality();
}

class SmartDevice implements AdvancedDeviceInterface{
    public void basicFunctionality(){
        System.out.println("Basic Functionality: Device is turning on");
    }

    @Override
    public void advancedFunctionality() {
        System.out.println("Advanced Functionality: Device is adjusting settings");
    }
}
public class E167MultipleInterface  {



    public static void main(String[] args){
        SmartDevice sd=new SmartDevice();
        sd.basicFunctionality();sd.advancedFunctionality();

    }
}


