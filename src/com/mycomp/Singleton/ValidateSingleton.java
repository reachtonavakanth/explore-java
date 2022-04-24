package com.mycomp.Singleton;

public class ValidateSingleton {

    public static void main(String[] args) {
        int value = Cart_Singleton.getInstance().x;
        System.out.println(value);

        // or

        Cart_Singleton sing1= Cart_Singleton.getInstance();
        Cart_Singleton sing2= Cart_Singleton.getInstance();

        System.out.println(sing1.x);
        System.out.println(sing2.x);

    }
}
