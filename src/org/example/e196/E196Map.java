package org.example.e196;

import java.util.*;

public class E196Map {



        public static void main(String[] args) {
        Map<String,List<String>> managedEmp=new LinkedHashMap<>();
        ArrayList<String>listHR=new ArrayList<>();
        listHR.add("Alice");
        listHR.add("Bob");
        managedEmp.put("HR Employees",listHR);
        ArrayList<String> listIT=new ArrayList<>();
        listIT.add("Charlie");
            listIT.add("Davide");
            listIT.add("Eve");
            managedEmp.put("IT Employees",listIT);

            managedEmp.forEach((k,v)-> System.out.println("Department: "+k+": "+v));




        }
    }


