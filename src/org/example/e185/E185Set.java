package org.example.e185;

import java.util.HashSet;

public class E185Set {
    public static void main(String[] args) {

        HashSet<Integer>iD=new HashSet<>();
        iD.add(1001);
        iD.add(1002);
        iD.add(1001);
        iD.add(1003);
        iD.add(1002);
        iD.add(1004);
        iD.forEach(x-> System.out.println(x));
}
}

