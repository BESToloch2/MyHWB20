package org.example.e144;

class StoreProdact{

    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    StoreProdact(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProdact(String label, double price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;
    }

    StoreProdact(String label, double price){
        this.label=label;
        this.price=price;
    }

    void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }
}

public class E144Constructor {
    public static void main(String[] args) {
    StoreProdact sp1=new StoreProdact("Eggs",3.0,"Produce",true, 10);
    sp1.display();
    StoreProdact sp2=new StoreProdact("Paper Towels",2.0,"misc",false, 24);
    sp2.display();
    StoreProdact sp3=new StoreProdact("Paper Towels",2.0,"misc",false, 0);
    sp3.display();


    }
}
