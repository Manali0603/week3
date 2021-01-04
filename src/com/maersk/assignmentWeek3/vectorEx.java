package com.maersk.assignmentWeek3;

import java.util.List;
import java.util.Vector;

public class vectorEx {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        list.add(45);
        list.add(78);
        list.add(34);
        list.add(19);
        list.add(40);
        System.out.println(list);
        list.set(2, 56);
        System.out.println("updated vector : " + list);
        list.remove(0);
        System.out.println("After removing an element : " + list);
    }
}
