package org.example.e150;

class  Person {
    private String name;
    private String lastName;
    private int age;

    Person() {
    }

    Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    String getName() {
        return name;
    }
    String getLastName() {
        return lastName;
    }
    int getAge() {
        return age;
    }
}

class Employee extends Person{

    private int salary;

    Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }
        Employee(String name, String lastName, int age){
            super(name, lastName, age);
    }
    public void printEmployeeDetailes (){
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + salary);
    }
    int getSalary(){
        return salary;
    }
}

class Student extends Employee{

    private int grade;

    Student(String name, String lastName, int age, int grade){
        super(name,lastName,age);
        this.grade=grade;
    }

    Student(String name, String lastName, int age){
        super(name,lastName,age);
    }
    public void printStudentDetails(){
        System.out.println(getName() + " " + getLastName() + " " + getAge() +" "+grade);
    }
    public int getGrade(){
        return grade;
    }
}

class Retiree extends Student {
    private String seniorActivity;

    Retiree(String name, String lastName, int age,String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;
    }
        public void printRetireeDetails () {
            System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + seniorActivity);
        }
}

public class E150Inheritance  {
    public static void main(String[] args) {

        Employee e1=new Employee("Joe", "Smith", 35,35000);
        Student s1=new Student("Adam","Smith", 15, 10);
        Retiree r1=new Retiree("Frank", "Smith", 15,"tour");
        e1.printEmployeeDetailes();
        s1.printStudentDetails();
        r1.printRetireeDetails();


    }

}
