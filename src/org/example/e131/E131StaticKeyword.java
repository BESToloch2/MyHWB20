package org.example.e131;

public class E131StaticKeyword {

    static String newStr="";
    static String thirdLetter(String s){
        for (int i = 0; i < s.length(); i+=3) {
        newStr+=s.charAt(i);
        }
        return  newStr;
    }
    public static void main(String[] args) {

        System.out.println(thirdLetter("abcdefg"));
    }
}
