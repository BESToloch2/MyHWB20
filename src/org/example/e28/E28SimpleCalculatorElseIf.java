package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        String  operator="*";

        // Declare two variables for numbers and assign values
        int num1=25;
        int num2=2;

        // Perform the corresponding arithmetic operation
        if(operator.equals("+")){
            System.out.print("The sum is: ");
            System.out.print(num1+num2);
        }else if(operator.equals("-")){
            System.out.print("The difference is: ");
            System.out.print(num1-num2);
        }else if(operator.equals("*")){
            System.out.print("The product is: ");
            System.out.print(num1*num2);
        } else if(operator.equals("/")) {
            System.out.print("The quotient is: ");
            System.out.print(num1/num2);
        }else{
            System.out.println("Invalid operator");
        }

    }
}
