package example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");
        // Capture the usage input
        int usage = input.nextInt();
        double bill;
        // Calculate bill using switch statement
        if (usage>0){
            if (usage > 0 && usage <= 100) {
                bill = usage*0.12;
                System.out.println("Your electricity bill is $"+usage*bill/100);
            } else if (usage > 100 && usage <= 200) {
                bill = usage*0.15;
                System.out.println("Your electricity bill is $"+usage*bill/100);
            } else if (usage > 200 && usage <= 300) {
                bill = usage*0.20;
                System.out.println("Your electricity bill is $"+usage*bill/100);
            } else{
                bill = usage*0.25;
                System.out.println("Your electricity bill is $"+usage*bill/100);
            }
        }else{
            System.out.println("Invalid usage entered");
        }
    }
}
