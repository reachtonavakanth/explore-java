package com.mycomp.constructorchaining;

public class ProductPage extends CartPage{

    public  ProductPage(){
        System.out.println("In Derived Class Default Constructor");
    }

    public static void main(String[] args) {
    ProductPage pp =new ProductPage();
    }
}
