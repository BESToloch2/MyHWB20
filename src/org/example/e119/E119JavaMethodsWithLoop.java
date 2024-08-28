package org.example.e119;

public class E119JavaMethodsWithLoop {
    public static void censorLetter(String str, char a) {
        StringBuffer sb= new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==a){
                sb.append('*');
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        censorLetter("beatch", 'e');
        // Students will write the code here.
        //
    }
    }
