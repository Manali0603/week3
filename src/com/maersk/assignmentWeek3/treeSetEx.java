package com.maersk.assignmentWeek3;

import java.util.Set;
import java.util.TreeSet;

public class treeSetEx {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>();
        st.add(321);
        st.add(300);
        st.add(367);
        st.add(344);
        st.add(311);
        System.out.println("It prints the elements in sorted order : " + st);
        System.out.println("Get the size of the treeSet : " + st.size());
        st.remove(300);
        System.out.println("updated set : " + st);
    }
}
