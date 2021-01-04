package com.maersk.assignmentWeek3;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSetEx {
    public static void main(String[] args) {
        Set<String> st1 = new LinkedHashSet<>();
        st1.add("Siri");
        st1.add("Sayi");
        st1.add("Shristi");
        st1.add("Sriti");
        st1.add("Shreya");
        st1.add("Sophy");
        System.out.println(st1);
        System.out.println(st1.hashCode());
    }
}
