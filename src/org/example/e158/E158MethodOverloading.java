package org.example.e158;
class LoanPaymentCalculator{

    public double calculatePayment(double loanAmount, double InterestRate){
    double payment= (loanAmount*(1+InterestRate/100))/12;
    return payment;
    }
    public double calculatePayment(double loanAmount, double InterestRate, int numberOfMonths){
        double payment= (loanAmount*(1+InterestRate/100))/numberOfMonths;
        return payment;
    }
    public double calculatePayment(double loanAmount, double InterestRate, int numberOfMonths, int downPayment){
        double payment= ((loanAmount-downPayment)*(1+InterestRate/100))/numberOfMonths;
        return payment;
    }
}
public class E158MethodOverloading {
    public static void main(String[] args){
    LoanPaymentCalculator lpc=new LoanPaymentCalculator();
        System.out.println(lpc.calculatePayment(10000, 5));
        System.out.println(lpc.calculatePayment(10000, 5, 24));
        System.out.println(lpc.calculatePayment(10000, 5, 24, 2000));
    }
}

