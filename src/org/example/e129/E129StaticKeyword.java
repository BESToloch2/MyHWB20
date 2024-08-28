package org.example.e129;

public class E129StaticKeyword {
    static String countryName;
    static String continentName;
    static void printInfo(){
        System.out.println(countryName+" located on "+continentName+" continent");
    }
        public static void main(String[] args) {
        countryName="Morocco";
        continentName="Africa";
        printInfo();

    }
}
