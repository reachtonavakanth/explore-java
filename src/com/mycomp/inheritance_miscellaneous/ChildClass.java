package com.mycomp.inheritance_miscellaneous;

public class ChildClass extends ParentClass{
    private static ChildClass childClass= null;
    public static void main(String[] args) {
        childClass= new ChildClass();
        childClass.accessingNonStatic();
        childClass.m5();
        childClass.m5(90);
        System.out.println(childClass.num);
        ParentClass.methodOverloading();
        ParentClass.methodOverloading(20);
        ParentClass.methodOverloading(20,30);
    }

    public void accessingNonStatic(){
        childClass.m5();
        childClass.m6();
       // childClass.m7(); // Compile-time error
        childClass.m8();
    }

    // m5() is overridden
    public void m5(){
        int a5=15;
        num=19;
        System.out.println("This is non-static m5");
        System.out.println("Value of a is "+ a5);
        System.out.println("Value of num is "+ num);
    }
    public void m5(int num){
        int a5=15;
        num=1;
        System.out.println("This is non-static m5");
    }
}
