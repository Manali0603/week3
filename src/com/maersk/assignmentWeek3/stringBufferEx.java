package com.maersk.assignmentWeek3;

public class stringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Manali");//now original string is changed
        System.out.println(sb);//prints HJavaello

        sb.replace(1, 3, "Siri");
        System.out.println(sb);//prints HJavalo

        sb.delete(1, 3);
        System.out.println(sb);//prints Hlo

        sb.reverse();
        System.out.println(sb);//prints olleH

        System.out.println(sb.capacity());
    }
}
