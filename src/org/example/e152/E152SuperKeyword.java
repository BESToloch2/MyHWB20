package org.example.e152;

class TransactionCalculator{
    public int calculateProfit(int num1, int num2){
        int totalRevenue=num1+num2;
        int cost=30;
        int totalCost=30*2;
        return totalRevenue-totalCost;
    }

    public int calculateProfit(int num1, int num2, int num3){
        int totalRevenue=num1+num2+num3;
        int cost=30;
        int totalCost=30*3;
        return totalRevenue-totalCost;
    }

    public int calculateProfit(int num1, int num2, int num3, int num4){
        int totalRevenue=num1+num2+num3+num4;
        int cost=30;
        int totalCost=30*4;
        return totalRevenue-totalCost;
    }
}



public class E152SuperKeyword {
    public static void main(String[] args) {
    TransactionCalculator t1=new TransactionCalculator();
        System.out.println(t1.calculateProfit(100,20,30,10));
        System.out.println(t1.calculateProfit(80,30,20));
        System.out.println(t1.calculateProfit(50,30));
    }
}

