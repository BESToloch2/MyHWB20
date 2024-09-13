package org.example.e161;
class Employee{
    public void work(){
        System.out.println("I am an Employee working");
    }
    protected void takeBreak(){
        System.out.println("I am an Employye taking a break");
    }
    void attendMeeting(){
        System.out.println("I am an Employee attending a meeting");
    }
    private void submitReport(){
        System.out.println("I am an Employee submitting a report");
    }

    void hello(){
        System.out.println("method in Employee class");
    }
}
class Manager extends Employee{
    public void work(){
        System.out.println("I am a Manager working");
    }
    protected void takeBreak(){
        System.out.println("I am a Manager taking a break");
    }
    void attendMeeting(){
        System.out.println("I am a Manager attending a meeting");
    }
    private void submitReport(){
        System.out.println("I am a Manager submitting a report");
    }

    void hello(){
        System.out.println("method in Manager class");
    }
}
class Developer extends Employee{
    public void work(){
        System.out.println("I am a Developer working");
    }
    protected void takeBreak(){
        System.out.println("I am a Developer taking a break");
    }
    void attendMeeting(){
        System.out.println("I am a Developer attending a meeting");
    }
    private void submitReport(){
        System.out.println("I am a Developer submitting a report");
    }

    void hello(){
        System.out.println("method in Developer class");
    }
}
class Intern extends Employee{
    public void work(){
        System.out.println("I am an Intern working");
    }
    protected void takeBreak(){
        System.out.println("I am an Intern taking a break");
    }
    void attendMeeting(){
        System.out.println("I am an Intern attending a meeting");
    }
    private void submitReport(){
        System.out.println("I am an Intern submitting a report");
    }

    void hello(){
        System.out.println("method in Intern class");
    }
}
public class E161MethodOverriding {

    public static void main(String[] args) {
        Manager m=new Manager();
        Developer d=new Developer();
        Intern i=new Intern();
        Employee[] arr={m,d,i};
        for (Employee a:arr){
            a.hello();
        }
        d.work();
        d.takeBreak();
        d.attendMeeting();
    }

}



