package org.example.e135;

public class E135StaticKeyword {
    static String surround(String s, String search_term) {
        String newString=s.replace(search_term, "(" + search_term + ")");
        return newString;
    }


    public static void main(String[] args) {
        System.out.println(surround("hzwhatisgoingon","o"));

    }
}
