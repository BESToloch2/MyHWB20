package org.example.e189;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class E189Set {
    public static void main(String[] args) {
        LinkedHashSet<String>emails=new LinkedHashSet<>();
        emails.add(null);
        emails.add("john.doe@example.com");
        emails.add("jane.smith@example.com");
        emails.add("john.doe@example.com");
        emails.add("admin@event.com");
        emails.add("info@company.com");
        emails.forEach(x-> System.out.println(x));
}

}
