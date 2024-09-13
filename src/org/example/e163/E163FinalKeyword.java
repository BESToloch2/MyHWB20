package org.example.e163;

class  StringManipulator{
    private String str;
    StringManipulator(String str){
        this.str=str;
    }
    final String reverseString(){
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        return str;
    }
}

class ArrayManipulator{
    final double avgElements(int[]elements){
        int sumElements=0;
        for (int e:elements){
            sumElements+=e;
        }
        return (double) sumElements/elements.length;
    }
}
public class E163FinalKeyword {

    public static void main(String[] args){
        StringManipulator sm=new StringManipulator("hello");
        ArrayManipulator am=new ArrayManipulator();
        System.out.println(sm.reverseString());
        int [] elements={3, 4, 5, 6, 6};
        System.out.println(am.avgElements(elements));

    }

}
