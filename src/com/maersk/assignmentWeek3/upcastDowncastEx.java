package com.maersk.assignmentWeek3;

class parent {
    int a;

    parent(int a) {
        this.a = a;
        System.out.println("a = " + a);
    }
}

class child extends parent {
    int b;

    child(int b) {
        super(43);
        this.b = b;
        System.out.println("b = " + b);
    }
}

public class upcastDowncastEx {
    public static void main(String[] args) {
        parent p = new child(42);
        child c = (child) new parent(12);
    }
}
