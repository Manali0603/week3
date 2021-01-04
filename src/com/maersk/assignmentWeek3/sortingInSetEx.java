package com.maersk.assignmentWeek3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class sortingInSetEx {
    public static void main(String[] args) {
        Set<Student> st = new HashSet<Student>();
        st.add(new Student("Manali", 23));
        st.add(new Student("Pihu", 24));
        st.add(new Student("Aditya", 21));
        st.add(new Student("Siri", 22));
        System.out.println(st);
        Set<Student> st1 = new TreeSet<Student>(st);
        System.out.println("sorted elements according to name : " + st1);
    }
}
