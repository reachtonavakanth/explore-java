package com.mycomp.abstractclass;

public class CartImplementation extends Cart{
    @Override
    public void m1() {
        System.out.println("Implementation of M1 !");
    }

    public static void main(String[] args) {

        CartImplementation cartImp= new CartImplementation();
        cartImp.m1();
        m2();
        cartImp.m3();
      //  cartImp.m4();
        // The above is compile time error as we cannot reference nonstatic members declared in abstract class
    }
}
