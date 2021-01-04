package com.maersk.assignmentWeek3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap();
        mp.put("Manali", 1706333);
        mp.put("Akash", 1706330);
        mp.put("Aditya", 1706291);
        mp.put("Shreya", 1706201);
        mp.put("Veer", 1706312);
        mp.put("Siri", 1706331);
        System.out.println("Initially : " + mp);
        mp.remove("Veer");
        System.out.println("after removing an element : " + mp);
        mp.putIfAbsent("Sowmya", 1705928);
        System.out.println("Updated list : " + mp);
        mp.replace("Aditya", 1706293);
        System.out.println("updated list after replacing : " + mp);
    }
}
