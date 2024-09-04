package org.example.e138;
public class E138AccessModifiers {

       public static void main(String[] args) {

              AnotherClass ac = new AnotherClass();
              System.out.println(ac.def());
              System.out.println(ac.prd());
              System.out.println(ac.pub());
       }
}

class AnotherClass{
private String prt(){
       return "private" ;
}
String def(){
       return "default";
}
protected String prd(){
       return "protected";
}
public String pub(){
       return "public";
       }

}
