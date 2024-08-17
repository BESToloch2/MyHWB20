package example.e14;

import java.security.spec.RSAOtherPrimeInfo;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
int totalSlices=13;
int friends=4;

        // Calculate slices per person
int slicesPerPerson=totalSlices/friends;
int leftoverSlices=totalSlices%friends;


        // Print the results
        System.out.println("Each person get "+slicesPerPerson+" slices");
        System.out.println("Threr are "+leftoverSlices+" slice left over");
    }
}
