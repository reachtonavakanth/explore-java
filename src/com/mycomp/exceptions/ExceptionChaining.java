package com.mycomp.exceptions;

public class ExceptionChaining {

    void method1(){
        int data=50/0;
    }
    void method2(){
        method1();
    }
    void method3(){
        try{
            method2();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        ExceptionChaining obj=new ExceptionChaining();
        obj.method3();
        System.out.println("normal flow...");
    }
}
