package org.example.e195;


import java.util.*;

public class E195Map {

    public static void main(String[] args) {
        Map<String,List<String>> groups=new LinkedHashMap<>();

        ArrayList<String>subjects=new ArrayList<>();
        ArrayList<String >students=new ArrayList<>();
        List<String>mathStudents=new ArrayList<>();
        mathStudents.add("Alice");
        mathStudents.add("Bob");
        groups.put("Mathematics",mathStudents);

        List<String>scienceStudents=new ArrayList<>();
        scienceStudents.add("Charlie");
        scienceStudents.add("David");
        groups.put("Science",scienceStudents);

        List<String>historyStudents=new ArrayList<>();
        historyStudents.add("Eve");
        historyStudents.add("Frank");
        groups.put("History",historyStudents);

        System.out.println("From Map (Students by Subject):");
        for (var entery:groups.entrySet()){
            System.out.println("Subject: "+entery.getKey()+" Students: "+entery.getValue());
        }


    }
    }
