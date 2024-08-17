package example.e54;

public class E54DoWhileLoop {
    public static void main(String[] args) {
        // Declare a counter variable and set it to 10
        int counter=10;
        // Use a do-while loop to create the countdown from 10 to 1
        do {
            System.out.println(counter);
            counter--;
        }while (counter>=1);
        System.out.println("Countdown complete!");
    }
}
