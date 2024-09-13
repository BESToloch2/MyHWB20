package org.example.e168;

interface Transaction{
    public double processTransaction(double amount);
}

interface BankOperation extends Transaction{
    public double deposit(double amount);
    public double withdraw(double amount);
    public double checkBalance();
}

class BankAccount implements BankOperation{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }

    @Override
    public double deposit(double amount) {
        balance+=amount;
        System.out.println("Transaction successful: Deposited "+amount);
        return 0;
    }

    @Override
    public double withdraw(double amount) {
        if (balance>=amount){
            balance-=amount;
            System.out.println("Transaction successful: Withdrew "+amount);
        }else {
            System.out.println("Transaction failed: Insufficient funds");
        }

        return 0;
    }

    @Override
    public double checkBalance() {
        System.out.println("Current Balance: "+balance);
        return 0;
    }
    @Override
    public double processTransaction(double amount) {
        return 0;
    }
}

public class E168MultipleInterface {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(0.0);
        ba.deposit(100.0);
        ba.withdraw(50.0);
        ba.checkBalance();
        ba.withdraw(100.0);

    }
}
