package example.e20;

public class E20EvenOrOddNumberIfConditions {
    public static void main(String[] args) {
        // Declare an integer variable and assign a value
        int number=10;
        // int number = 10;
        int mod=10%2;
        if(mod==0){
            System.out.println("The number is even");
        }else if(mod==1){
            System.out.println("The number is odd");
        }

    }
}
