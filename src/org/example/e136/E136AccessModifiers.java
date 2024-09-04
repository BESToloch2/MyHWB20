package org.example.e136;

public class E136AccessModifiers {
    static private void tipm(){
        System.out.println("This is Private Method");
    }
    static void tidm (){
        System.out.println("This is Default Method");
    }
    static protected void tiprm (){
        System.out.println("This is Protected Method");
    }
    static public void tipkm(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        tipm();
        tidm();
        tiprm();
        tipkm();

    }
}


