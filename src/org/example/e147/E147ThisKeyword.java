package org.example.e147;

public class E147ThisKeyword {
    public static void main(String[] args) {

        CarObject c1=new CarObject("Toyota 2019",50000.0,50);
        CarObject c2=new CarObject("BMW 2019",10883.0,60);
        c1.carStockValue();
        c2.carStockValue();

    }
}

class CarObject{
    private String model;
    private double price;
    private int quantity;

    CarObject(String model,double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    void carStockValue(){
        System.out.println(model+" Stock Value "+(this.price*this.quantity));
    }

}
