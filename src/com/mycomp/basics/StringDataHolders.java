package com.mycomp.basics;

public class StringDataHolders {
    public static void main(String[] args) {
        holdString();
        stringFunctions();
    }

    public static void holdString() {
        String str1 = "I am a string";
        String str2 = new String("Welcome");
    }

    public static void stringFunctions() {
        String str1 = "This a String Class";
        System.out.println("Character at 0 of string \"" + str1 + "\" is --> " + str1.charAt(0));
        System.out.println("**********--------------------*************");
        System.out.println("Length of \"" + str1 + "\"" + str1.length());
        System.out.println("**********--------------------*************");
        System.out.println("String After trim is " + str1.trim());
        System.out.println("**********--------------------*************");
        System.out.println("Sub String After of \"" + str1 + "\" " + " ---> " + str1.substring(2));
        System.out.println("String after Sub string function " + " ---> " + str1);
        System.out.println("**********--------------------*************");
        System.out.println("Sub String After of \"" + str1 + "\" " + " ---> " + str1.substring(2, 13));
        System.out.println("String after Sub string function " + " ---> " + str1);
        System.out.println("**********--------------------*************");
        System.out.println("Contains verification --> " + str1.contains("la"));
        System.out.println("Contains verification --> " + str1.contains("imp"));
        System.out.println("**********--------------------*************");
        System.out.println("Joining of 23 04 2021 with delimiter /--> " + str1.join("/", "23","04","2021"));
    }
}
