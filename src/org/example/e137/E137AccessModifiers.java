package org.example.e137;

public class E137AccessModifiers {
     private String name;
     String city;
     protected String schoolname;
     public int batchnumber;

    public void display(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolname+" in batch "+batchnumber);
    }

    public static void main(String[] args) {
        E137AccessModifiers person=new E137AccessModifiers();
        person.name="John";
        person.city="Miami";
        person.schoolname="Syntax";
        person.batchnumber=9;

        person.display();
    }
}

