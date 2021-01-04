package com.maersk.assignmentWeek3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayListEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("siri");
        names.add("shikha");
        names.add("sayi");
        names.add("shiv");
        Iterator itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("-----------------------------------");
        System.out.println("Get method : " + names.get(1));
        //Set method
        names.set(3, "shreya");
        System.out.println(names);
        System.out.println("-----------------------------------");
        names.add("soma");
        names.add("shivangi");
        names.add("seema");
        names.add("shreyansh");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("After sorting : " + names);
        System.out.println("-----------------------------------");
    }
}
