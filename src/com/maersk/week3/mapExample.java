package com.maersk.week3;

import java.util.*;

public class mapExample {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1, "Manali");
        mp.put(2, "Siri");
        mp.put(3, "Jijo");
        mp.put(4, "Pratik");
        System.out.println(mp);
        System.out.println("--------------------------------------------");
        Map<String, String> mp1 = new LinkedHashMap<>();
        mp1.put("a", "manali");
        mp1.put("b", "aditya");
        mp1.put("c", "jijo");
        mp1.put("d", "sawmya");
        mp1.put("a", "manali");
        mp1.put("e", "prateek");
        System.out.println("Linkedhashmap will not print the duplicate elements" + mp1);
        System.out.println("---------------------------------------------");
        Map<Integer, Integer> mp2 = new TreeMap();
        mp2.put(1, 333);
        mp2.put(2, 121);
        mp2.put(3, 543);
        mp2.put(4, 103);
        System.out.println(mp2);



    }
}
