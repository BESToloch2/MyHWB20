package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {
        HashMap<Integer,String>students=new HashMap<>();
        students.put(101,"John");
        students.put(102,"Emily");
        students.put(103,"Michael");
        students.put(104,"Sarah");
        students.put(105,"David");
        System.out.println();
        System.out.println("Student IDs:");
        for (Integer studentID: students.keySet()){
            System.out.println("Student ID: "+studentID);
        }
        System.out.println();
        System.out.println("Student Names:");
        for (String name: students.values()){
            System.out.println("Student Name: "+name);
        }
        System.out.println();
        System.out.println("Student Records:");
        for (Map.Entry<Integer,String> student:students.entrySet()){
            System.out.println("Student ID: "+student.getKey()+", Student Name: "+student.getValue());
        }

    }

}
