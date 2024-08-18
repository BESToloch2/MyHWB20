package AsgharHW;

import java.util.Scanner;

public class E2ChildName {
    public static void main(String[] args) {
/*
Write a program that reads two people's first
names and if they are expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter mother first name:");
        String matherName=input.nextLine();
        System.out.println("Enter the expected gander(Boy/Girl) for baby:");
        String babyGenderM=input.nextLine();

        System.out.println("Enter father first name:");
        String fatherName=input.nextLine();
        System.out.println("(Father)Enter the expected gender(Boy/Girl) for baby:");
        String babyGenderF=input.nextLine();

         if (babyGenderM.equalsIgnoreCase("Boy")&& babyGenderF.equalsIgnoreCase("Boy")){
             System.out.println("Suggested baby name: "+fatherName);
         }else if (babyGenderM.equalsIgnoreCase("Girl")&&babyGenderF.equalsIgnoreCase("Girl")){
             System.out.println("Suggested baby name: "+matherName);
         }
    }
}
