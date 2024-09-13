package org.example.e146;

public class E146ThisKeyword {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("Joe", "Smith",12345,"01/01/1970",35000);
        System.out.println(e1.PrintDetails());
        System.out.println(e2.PrintDetails());
    }
}

class Employee {

    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    Employee() {
        this.name = null;
        this.lastName = null;
        this.employeeId = 0;
        this.startDate = null;
        this.salary = 0;
    }

    Employee(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }

    String PrintDetails(){
        StringBuilder newString=new StringBuilder();
        newString.append(this.name+" ").append(this.lastName+" ").append(this.employeeId+" ").append(this.startDate+" ").append(this.salary);
        return newString.toString();
    }
}

