package org.example.e140;

public class E140AccessModifiers {
    private String maxLength(String[] words){
        int largest=words[0].length();
        int index=0;

        for (int i = 0; i < words.length; i++) {
            if (largest<words[i].length()){
                largest=words[i].length();
                index=i;
            }

        }
        return words[index];
    }

    public static void main(String[] args) {

        E140AccessModifiers a=new E140AccessModifiers();
        String[] words={"this", "is", "a", "long", "word"};
        System.out.println(a.maxLength(words));
    }

}
