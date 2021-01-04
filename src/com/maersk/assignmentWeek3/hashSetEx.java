package com.maersk.assignmentWeek3;

import java.util.HashSet;
import java.util.Set;

public class hashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        System.out.println(set);
        set.remove("Ravi");
        System.out.println("After invoking remove method: " + set);
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);
    }
}
