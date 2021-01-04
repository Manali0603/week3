package com.maersk.assignmentWeek3;

import java.util.*;

class Student2 implements Comparable<Student2> {

    String name;
    int age;

    Student2(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        // to check if both the object references are referring to the same object.
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student2 other = (Student2) obj;

        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int p = 23;
        int res = 1;
        res = p * res + age;
        res = p * res + ((name == null) ? 0 : name.hashCode());
        return res;
    }

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class equalsNhashCode {
    public static void main(String[] args) {
        Set<Student2> st = new HashSet<Student2>();
        st.add(new Student2("Manali", 23));
        st.add(new Student2("Zoya", 24));
        st.add(new Student2("Siri", 22));
        st.add(new Student2("Manali", 23));
        System.out.println(st);
        //Collections.sort(ls);


    }
}
