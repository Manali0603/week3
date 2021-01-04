package com.maersk.assignmentWeek3;

import java.util.LinkedList;
import java.util.List;

public class linkedListEx {
    public static void main(String[] args) {
        List<Integer> ls = new LinkedList<>();
        ls.add(201);
        ls.add(233);
        ls.add(457);
        ls.add(321);
        ls.add(100);
        System.out.println(ls);
        ls.remove(4);
        System.out.println("after removing an element : " + ls);
        ls.set(2, 289);
        System.out.println("after adding an element at a particular index : " + ls);
        System.out.println("Printing a particular element : " + ls.get(3));
    }
}
