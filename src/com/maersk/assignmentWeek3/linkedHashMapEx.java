package com.maersk.assignmentWeek3;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> hm = new LinkedHashMap<Integer, String>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println(hm);
        System.out.println(hm.get(103));
        hm.putIfAbsent(105, "Manali");
        System.out.println(hm.get(105));
    }
}
