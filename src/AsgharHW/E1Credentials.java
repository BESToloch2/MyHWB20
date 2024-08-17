package AsgharHW;

import java.util.Scanner;

public class E1Credentials {
    public static void main(String[] args) {
/*
Store username, password and confirm password from a user and check following requirements:

Username or Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter user name ");
        String username = input.nextLine();
        System.out.println("Enter password ");
        String password = input.nextLine();
        String rightUser="BESToloch2";
        String rightPass="12345678";
        int summChar = 0;

        for (int i = 0; i < password.length(); i++) {
            summChar++;
        }

        if (username.isEmpty() && password.isEmpty()) {
            System.out.println("Username or Password cannot be empty");
        }else if (summChar != 8) {
            System.out.println("Password is too short");
        }else if (username.equals(password)){
            System.out.println("Password cannot contain username");
        }else if (password.equals(rightPass)&&username.equals(rightUser)){
            System.out.println("Your username and password has been created");
        }else{
            System.out.println("Passwords or username do not match");
        }

    }
}

