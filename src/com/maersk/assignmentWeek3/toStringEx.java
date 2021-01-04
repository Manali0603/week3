package com.maersk.assignmentWeek3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDetails implements Comparable<EmployeeDetails> {
    int age;
    String name;


    public EmployeeDetails(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "\nEmployeeDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(EmployeeDetails o) {
        return this.name.compareTo(o.name);
    }
}

class toString_ComparableEx {
    public static void main(String[] args) {
        List<EmployeeDetails> l1 = new ArrayList<EmployeeDetails>();
        EmployeeDetails e1 = new EmployeeDetails(23, "Manali");
        EmployeeDetails e2 = new EmployeeDetails(21, "Siri");
        EmployeeDetails e3 = new EmployeeDetails(24, "Jijo");
        EmployeeDetails e4 = new EmployeeDetails(22, "Aditya");
        EmployeeDetails e5 = new EmployeeDetails(23, "Prateek");
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        l1.add(e5);
        Collections.sort(l1);
        System.out.println("After sorting : " + l1);
    }
}
