package com.mycomp.basics;

import java.util.Locale;

public class StringDataHolders {
    public static void main(String[] args) {
        holdString();
        stringFunctions();
        splitString("This is a String");
        indexOfaString("this is index of example");
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
        System.out.println("Joining of 23 04 2021 with delimiter /--> " + str1.join("/", "23", "04", "2021"));
        System.out.println("Equals Function ---> " + str1.equals("My String"));
        System.out.println("Equals Function ---> " + str1.equals("This a String Class"));
        System.out.println("**********--------------------*************");
        System.out.println("EqualsIgnoreCase Function ---> " + str1.equalsIgnoreCase("My String"));
        System.out.println("EqualsIgnoreCase Function ---> " + str1.equalsIgnoreCase("This a String Class"));
        System.out.println("**********--------------------*************");
        System.out.println("Empty Function ---> " + str1.isEmpty());
        String str2 = "";
        System.out.println("Empty Function ---> " + str2.isEmpty());
        System.out.println("**********--------------------*************");
        System.out.println("Concat Function ---> " + str1.concat(" in Java")); // immutable
        System.out.println("**********--------------------*************");
        System.out.println("Replace Function ---> " + str1.replace("This", " This is")); // immutable
        System.out.println(str1);
        System.out.println("Replace Function ---> " + str1.replace("TThis", " This is"));
        System.out.println(str1);
        System.out.println("**********--------------------*************");
        System.out.println("Replace Function ---> " + str1.replace("this", " This is"));
        System.out.println("**********--------------------*************");
        System.out.println("Uppercase Function ---> " + str1.toUpperCase());
        System.out.println("**********--------------------*************");
        System.out.println("Lowercase Function ---> " + str1.toLowerCase());
        System.out.println("**********--------------------*************");
        System.out.println("Trim Function ---> " + str1.trim());
        System.out.println("**********--------------------*************");
        System.out.println("Value of Function ---> " + str1.valueOf(str1)); // Converts other data types to String type
    }

    public static void splitString(String str) {
        String[] splitArr = str.split("\\s");
        for (String arr : splitArr) {
            System.out.println(arr);
        }
        System.out.println("**********--------------------*************");
        String[] splitArr2 = str.split("test");
        for (String arr : splitArr2) {
            System.out.println(arr);
        }
        System.out.println("**********--------------------*************");
        String[] splitArr3 = str.split("\\s", 2);
        for (String arr : splitArr3) {
            System.out.println(arr);
        }
    }

    public static void indexOfaString(String str) {
        //this is index of example
//passing substring
        int index1 = str.indexOf("is");//returns the index of is substring
        int index2 = str.indexOf("index");//returns the index of index substring
        System.out.println(index1 + "  " + index2);//2 8

//passing substring with from index
        int index3 = str.indexOf("is", 4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4 = str.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3

        int index5 = str.indexOf('i',3);//returns the index of i char value
        System.out.println(index5);// 5

        System.out.println(str.indexOf("example"));

        System.out.println(str.lastIndexOf("is"));
    }
}
