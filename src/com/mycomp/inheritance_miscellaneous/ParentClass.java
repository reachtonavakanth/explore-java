package com.mycomp.inheritance_miscellaneous;

public class ParentClass {
int num=0;
final int num2=20;
    public static void m1(){
        int a1=10;
        System.out.println("This is static m1");
    }

    final public  static void m2(){
        int a2=10;
        System.out.println("This is static final m2");
    }
    private static void m3(){
        int a3=10;
        System.out.println("This is static m3");
    }
     static void m4(){
         int a4=10;
        System.out.println("This is static m4");
    }
    // Non-Static
    public void m5(){
        int a5=10;
        num=1;
        System.out.println("This is non-static m5");
    }

    final public void m6(){
        num =2;
        int a6=10;
        System.out.println("This is non-static final m6");
    }
    private void m7(){
        num= 3;
        int a7=10;
        System.out.println("This is non-static m7");
    }
    void m8(){
        num=4;
        int a8=10;
        System.out.println("This is non-static m8");
    }

    /* methodOverloading functions */

    public static void methodOverloading(){
        System.out.println("This is a default parameter function !");
    }

    public static void methodOverloading(int a){
        a= 10;
        System.out.println("This is single parameter function " + a);
    }
    public static int methodOverloading(int a, int b){
        a= 10; b=20;
        System.out.println("This is single parameter function " + a + b);
        return a;
    }
}