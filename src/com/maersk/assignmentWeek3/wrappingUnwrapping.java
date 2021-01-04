package com.maersk.assignmentWeek3;

import java.util.ArrayList;

public class wrappingUnwrapping {
    public static void main(String[] args) {
        char ch = 'a';

        // boxing- primitive to Character object conversion
        Character a = ch;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // boxing because ArrayList stores only objects
        arrayList.add(25);
        System.out.println(arrayList.get(0));

        Character ch1 = 'a';
        // unboxing - Character object to primitive conversion
        char a1 = ch;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(24);
        // unboxing because get method returns an Integer object
        int num = list.get(0);
        System.out.println(num);
    }
}
