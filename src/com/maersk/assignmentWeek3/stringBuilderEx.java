package com.maersk.assignmentWeek3;

public class stringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Manali");//now original string is changed
        System.out.println(sb);//prints Hello Manali

        sb.insert(1, "Naik");//now original string is changed
        System.out.println(sb);

        sb.replace(1, 3, "Maersk");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
    }
}
