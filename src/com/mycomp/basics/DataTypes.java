package com.mycomp.basics;

public class DataTypes {
    public static void main(String[] args) {
        integerDataTypes();
        floatDataTypes();
        doubleDataTypes();
        charDataTypes();
        booleanDataTypes();
        byteDataTypes();
        shortDataTypes();
        longDataTypes();
    }

    public static void integerDataTypes() {
        int a = 10;
        int b = 20, c = 30;
        int d = c + 1;
        System.out.println(" a is : " + a);
        System.out.println(" b is : " + b + " c is : " + c);
        System.out.println(" d is : " + d);
        System.out.println("*************************************");
    }
    public static void floatDataTypes() {
        float f1=100.01f;
        System.out.println(" Float Value f1 : " + f1);
        System.out.println("*************************************");
    }
    public static void doubleDataTypes() {
        double d1=100.91;
        System.out.println(" Double Value d1 : " + d1);
        System.out.println("*************************************");
    }
    public static void charDataTypes() {
        char c1='a';
        System.out.println(" Char Value c1 : " + c1);
        System.out.println("*************************************");
    }
    public static void booleanDataTypes() {
        boolean b1=true;
        boolean b2=false;
        System.out.println(" boolean Value b1 : " + b1);
        System.out.println(" boolean Value b1 : " + b2);
        System.out.println("*************************************");
    }
    public static void byteDataTypes() {
        byte b1=10, b2=-55;
        System.out.println(" byte Value b1 : " + b1 + " b2 : "+ b2) ;
        System.out.println("*************************************");
    }
    public static void shortDataTypes() {
        short s1 = 10000 , s2 = -10000;
        System.out.println(" short Value s1 : " + s1 + " s2 : "+ s2);
        System.out.println("*************************************");
    }
    public static void longDataTypes() {
        long l1= 1000000000;
        System.out.println(" long Value l1 : " + l1);
        System.out.println("*************************************");
    }

}
