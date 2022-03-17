package com.mycomp.basics;

public class StringBuilderExamples {
    public static void main(String[] args) {
        stringBuilderExample_One();
    }

    public static void stringBuilderExample_One(){
        StringBuilder sbuil= new StringBuilder("Welcome");
        sbuil.append(" To ");
        System.out.println(sbuil);
        sbuil.append("Java Programming !");
        System.out.println(sbuil);
        sbuil.insert(0,"Hello ");
        System.out.println(sbuil);
        sbuil.replace(0,5,"Hi");
        System.out.println(sbuil);
        System.out.println("Before Reverse "+sbuil);
        sbuil.reverse();
        System.out.println("After Reverse "+sbuil);
    }
}
