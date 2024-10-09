package org.example.e172;

class Customer{
    private long accountNumber;
    private String fullName;
    private String email;
    private double balance;
    Customer(long accountNumber, String fullName, String email, double balance){
        this.accountNumber=accountNumber;
        this.fullName=fullName;
        this.email=email;
        this.balance=balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

public class E172Encapsulation {
    public static void main(String[] args){
    Customer c1=new Customer(1234567890,"Sarah Connor","sarah.connor@example.com", 15000.0);
        System.out.println("Account Number: "+c1.getAccountNumber());
        System.out.println("Full Name: "+c1.getFullName());
        System.out.println("Email: "+c1.getEmail());
        System.out.println("Account Balance: "+c1.getBalance());
    }

}


