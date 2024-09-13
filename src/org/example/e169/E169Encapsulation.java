package org.example.e169;

class Employee{
    private String empName;
    private int empAge;

    public void getEmpAge() {
        System.out.println("Employee Age: "+empAge);
    }
    public int setEmpAge(int empAge){

        return this.empAge=empAge;
    }

    public void getEmpName() {
        System.out.println("Employee Name: "+empName);
    }

    public String setEmpName(String empName){
        return this.empName=empName;
    }

}

public class E169Encapsulation {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setEmpName("John");
        e1.setEmpAge(30);
        e1.getEmpName();
        e1.getEmpAge();
    }
}
