package org.example.e197;

import java.util.HashMap;
import java.util.Map;

class Dog{
    private String name;
    private String breed;
    private int age;

    Dog(String name, String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public String toString(){
        return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
    }
}



public class E197Map {

    public static void main(String[] args) {
        Map<Integer,Dog>listDogs=new HashMap<>();
        Dog d1=new Dog("Max","Labrador",5);
        Dog d2=new Dog("Bella","Beagle",3);
        Dog d3=new Dog("Rocky","Bulldog",4);

        listDogs.put(1,d1);
        listDogs.put(2,d2);
        listDogs.put(3,d3);
        listDogs.forEach((k,v)-> System.out.println("Dog ID: "+k+", Details: "+v.toString()));

    }
}

