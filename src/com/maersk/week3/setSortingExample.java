package com.maersk.week3;

import java.util.*;

class Employee implements Comparable<Employee> {
    int age;
    String name;

    Employee() {

    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "\nEmployee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}

public class setSortingExample {
    public static void main(String[] args) {
        Set<Employee> st = new HashSet<Employee>();
        Employee e1 = new Employee(23, "manali");
        Employee e2 = new Employee(22, "siri");
        Employee e3 = new Employee(21, "jijo");
        Employee e4 = new Employee(24, "prateek");
        Employee e5 = new Employee(25, "aditya");
        st.add(e1);
        st.add(e2);
        st.add(e3);
        st.add(e4);
        st.add(e5);
        System.out.println(st);
        Set<Employee> st1 = new TreeSet<Employee>(st);
        System.out.println(st1);
    }

}
