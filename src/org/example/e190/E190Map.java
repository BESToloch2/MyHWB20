package org.example.e190;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class E190Map {
    public static void main(String[] args) {
        LinkedHashMap<String,String>adress=new LinkedHashMap<>();
        adress.put("Street","Patrick ST");
        adress.put("Suite","265");
        adress.put("City","Vienna");
        adress.put("Zip","22180");
        adress.put("Country","United States");
        adress.forEach((k,v)-> System.out.println(v));
    }
}
