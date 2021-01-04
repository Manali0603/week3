package com.maersk.week3;

import java.util.*;

public class listExample {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(51);
        l1.add(22);
        l1.add(45);
        l1.add(50);
        l1.add(65);
        l1.add(12);
        System.out.println(l1);
        l1.add(70);
        System.out.println("printing all the elements after adding an element : " + l1);
        System.out.println("printing the size of arraylist : " + l1.size());
        System.out.println("checks if an element is present : " + l1.contains(73));
        System.out.println("to print the element of a particular index : " + l1.get(0));
        l1.remove(3);
        System.out.println("printing after removing an element : " + l1);
        Collections.sort(l1);
        System.out.println("after sorting : " + l1);
        System.out.println(".................................");
        List<Integer> l2 = new LinkedList<>();
        l2.add(89);
        l2.add(75);
        l2.add(80);
        l2.add(81);
        l2.add(100);
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println("After sorting the linked list : " + l2);
        l2.add(4, 23);
        System.out.println(l2);
        System.out.println("-------------------------------------");
        List<Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(30);
        v1.add(36);
        v1.add(5);
        v1.add(16);
        v1.add(100);
        System.out.println(v1);
        Collections.sort(v1);
        System.out.println("After sorting the vector : " + v1);


    }
}
