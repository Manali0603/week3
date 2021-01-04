package com.maersk.assignmentWeek3;

public class stringExample {
    public static void main(String[] args) {
        String s = "manali";
        String s1 = new String("naik");
        System.out.println(s);
        System.out.println(s1);
        System.out.println("-------------------------------");
        String s3 = s + " ";
        s3 = s3 + s1;
        System.out.println(s3);
        System.out.println("------------------------------------");
        String s4 = "Aditya";
        String s5 = "Aditya";
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
        System.out.println("---------------------------------------");
        String s6 = new String("Aditya");
        System.out.println("== checks does address comparison : " + s4 == s6);
        System.out.println("equals method checks the content : " + s4.equals(s6));
        System.out.println("----------------------------------------");
        Integer a = new Integer(90);


    }
}
