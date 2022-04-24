package com.mycomp.constructorchaining;

public class CartPage {

 public CartPage(){
       this(10);
        System.out.println("This is default constructor !");
    }

    public CartPage(int a){
        this("Testing");
        System.out.println("This is Int Parametrized constructor !");
    }

    public CartPage(String str){
        System.out.println("This is String Parametrized constructor !");
    }

    public static void main(String[] args) {
    CartPage cp=new CartPage(2);
    }


}
