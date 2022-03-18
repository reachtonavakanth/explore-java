package com.mycomp.basics;

public class StringBufferExamples {
    public static void main(String[] args) {
        stringBufferExample_One();
    }

    public static void stringBufferExample_One(){
        StringBuffer sbuf= new StringBuffer("Welcome");
        sbuf.append(" To ");
        System.out.println(sbuf);
        sbuf.append("Java Programming !");
        System.out.println(sbuf);
        sbuf.insert(0,"Hello ");
        System.out.println(sbuf);
        sbuf.replace(0,5,"Hi");
        System.out.println(sbuf);
        System.out.println("Before Reverse "+sbuf);
        sbuf.reverse();
        System.out.println("After Reverse "+sbuf);
    }
}
