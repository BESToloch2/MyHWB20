package example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
double morninExpens=10.25;
        double afternoonExpens=20.15;
        double eveningExpens=30.99;

        // Calculate total expense
        double totalExpense=morninExpens+afternoonExpens+eveningExpens;

        // Define a budget
        double budget=100;

        // Check if within budget
        System.out.println("Your total daily expens is: "+totalExpense);
        if(totalExpense<=budget){
            System.out.println("You are within the budget");
        }else {
            System.out.println("You are over the budget");
        }


    }
}
