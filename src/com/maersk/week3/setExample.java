package com.maersk.week3;


class Student implements Comparable<Student>{
    int roll;
    String name;
    public Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}

public class setExample {

    public static void main(String[] args) {


    }

}
