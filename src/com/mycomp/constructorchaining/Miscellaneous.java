package com.mycomp.constructorchaining;

public class Miscellaneous {

    // Following can't be constructors
    public static void Miscellaneous(){
        System.out.println("This is static");
    }

    public final void Miscellaneous(int a){
        System.out.println("This is final");
    }

    public void Miscellaneous(int a,int b){
        System.out.println("This is final");
    }

    public static void main(String[] args) {
        Miscellaneous mis = new Miscellaneous();
    }
}
