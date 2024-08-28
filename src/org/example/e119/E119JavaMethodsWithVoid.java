package org.example.e119;

public class E119JavaMethodsWithVoid {
    public static void censorLetter(String str, char a) {

        System.out.println(str.replace(a, '*'));
    }
    public static void main(String[] args) {
        censorLetter("beatch", 'e');
        // Students will write the code here.
    }
}
