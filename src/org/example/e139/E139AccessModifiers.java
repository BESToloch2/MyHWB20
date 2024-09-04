package org.example.e139;

public class E139AccessModifiers {
    String replaceSpaces(String str){
        String result=str.replace(' ','_');
        return result;
    }

    public static void main(String[] args) {
        E139AccessModifiers a=new E139AccessModifiers();
        System.out.println(a.replaceSpaces("java is fun"));
    }
}

