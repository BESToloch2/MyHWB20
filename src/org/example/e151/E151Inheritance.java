package org.example.e151;


class BankAccount{

    private String accountHolderName;
    private double balance;
    private String accountNumber;

    BankAccount(String accountHolderName, double balance, String accountNumber){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public void printAccountInfo(){
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends BankAccount{

    private double interestRate;
    SavingsAccount(String accountHolderName, double balance, String accountNumber, double interestRate){
        super(accountHolderName,balance,accountNumber);
        this.interestRate=interestRate;
    }
    public void applyInterest(){
    double interest=getBalance()*interestRate;
    }
    double getInterestRate(){
        return interestRate;
    }
}

class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= overdraftLimit) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    private void setBalance(double balance) {
        super.deposit(balance - getBalance());
    }

}
public class E151Inheritance {
    public static void main(String[] args) {
        SavingsAccount sA = new SavingsAccount("John Doe", 1000.0, "123456789", 0.05);
        CheckingAccount cA = new CheckingAccount("Jane Smith", 100.0, "987654321", 200.0);
    sA.printAccountInfo();
    cA.printAccountInfo();

    }
}
