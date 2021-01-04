package com.maersk.assignmentWeek3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int age;
    String name;

    Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class ageCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.age - e2.age;
    }
}

class nameCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

public class comparatorEx {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(24, "Manali"));
        emp.add(new Employee(22, "Siri"));
        emp.add(new Employee(23, "Nisha"));
        emp.add(new Employee(24, "zoya"));
        System.out.println(emp);
        Collections.sort(emp, new nameCompare());
        System.out.println("Based on name : " + emp);
        Collections.sort(emp, new ageCompare());
        System.out.println("Based on Age : " + emp);
    }
}
