package org.example.e184;


import java.util.ArrayList;
import java.util.List;

public class E184List {

    public static List<String> removeCountriesStartinWithA(List<String> list) {
        list.removeIf(x -> x.startsWith("A"));
    return list;
    }
    public static void main(String[] args) {
    List<String> list=new ArrayList<>();
        list.add("USA");
        list.add("Argentina");
        list.add("Kazakhstan");
        list.add("Australia");
        list.add("Pakistan");
        list.add("Russia");
        removeCountriesStartinWithA(list);
        System.out.println(list);
    }
}
