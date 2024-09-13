package org.example.e145;

public class E145ThisKeyword {
    public static void main(String[] args) {
        Dog d1=new Dog("Tarzan",50.0);

        Dog d2=new Dog("Lucy",10);

        System.out.println(d1.displayDetails());
        System.out.println(d2.displayDetails());




    }

}


class Dog{
    private String dogName;
    private double dogWeight;
    static String dogBreed="Mutt";
    Dog(String dogName, double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
    }
    String displayDetails(){
        StringBuilder newString =new StringBuilder();
        newString.append(this.dogName+" ").append(dogBreed+" ").append(this.dogWeight);
    return newString.toString();
    }
}