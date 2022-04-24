package com.mycomp.interfaces;

public class ProductDetailsImplementation implements ProductDetailsDraft {

    // After implements keyword we can have multiple interfaces
    @Override
    public void getProductDetails() {
        System.out.println("This is implementation of getProductDetails function from interface");
    }

    @Override
    public String getProductDetails_One() {
        System.out.println("This is implementation of getProductDetails_One function from interface");
        return new String("Welcome to Java");
    }

    @Override
    public String getProductDetails_One(int num) {
        System.out.println("This is implementation of getProductDetails_One(int num) function from interface");
        return new String("Welcome to Java 8");
    }

    @Override
    public void getProductDetails_Three() {
        System.out.println("This is implementation of getProductDetails_Three() function from interface");
    }

    public static void main(String[] args) {
        ProductDetailsImplementation productDetailsImplementation = new ProductDetailsImplementation();
        productDetailsImplementation.getProductDetails();
        productDetailsImplementation.getProductDetails_One();
        productDetailsImplementation.getProductDetails_One(5);
        ProductDetailsDraft.getProductDetails_Two(5);
        productDetailsImplementation.getProductDetails_Three();
    }
}