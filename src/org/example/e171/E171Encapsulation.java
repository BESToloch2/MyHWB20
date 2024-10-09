package org.example.e171;

class Employee{
    private String empName = "John";
    private int empAge = 30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}
public class E171Encapsulation {
    public static void main(String[] args){
    Employee e1=new Employee();
        System.out.println("Employee Name: "+e1.getEmpName());
        System.out.println("Employee Age: "+e1.getEmpAge());

    }
}



