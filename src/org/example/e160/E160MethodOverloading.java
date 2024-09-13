package org.example.e160;

public class E160MethodOverloading {

        private void displayInfo(){
            System.out.println("private displayInfo method");
        }
        private void displayInfo(int balance){
            System.out.println("private displayInfo method with balance: "+balance);
        }
        static void displayBankInfo(){
            System.out.println("static method without parameter");
        }
        static void displayBankInfo(int branches){
            System.out.println("static method with int parameter: "+branches);
        }

    public static void main(String[] args) {
        E160MethodOverloading ba=new E160MethodOverloading();
        ba.displayInfo();
        ba.displayInfo(5000);
        displayBankInfo();
        displayBankInfo(20);
    }
}


