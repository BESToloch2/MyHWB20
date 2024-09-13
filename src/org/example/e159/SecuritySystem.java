package org.example.e159;

public class SecuritySystem {
    private void authenticate(){
        System.out.println("Authentication with password");
    }
    private void authenticate(int otp){
        System.out.println("Authentication with OPT: "+otp);
    }
    public void performAuthentication(){
        authenticate();
        authenticate(123456);
    }

    public static void main(String[] args) {
        SecuritySystem s1=new SecuritySystem();
        s1.performAuthentication();
    }

}
