package org.example.e148;

public class E148ThisKeyword {
    public static void main(String[] args){
        ShoppingStore s1=new ShoppingStore("Blanket", 49.99,2);
        ShoppingStore s2=new ShoppingStore("Mattress", 219.59,2);
        double totalSum= s1.itemTotalPrice()+s2.itemTotalPrice();
        System.out.println("You purchased "+totalSum+" Today");


    }
}

class ShoppingStore{
    private String item;
    private double price;
    private int quantity;

    ShoppingStore(String item, double price, int quantity){
    this.item=item;
    this.price=price;
    this.quantity=quantity;
    }

    double itemTotalPrice(){
        double tp=this.price*this.quantity;
        System.out.println(this.item+" Total Value "+tp);
    return tp;
    }
}
