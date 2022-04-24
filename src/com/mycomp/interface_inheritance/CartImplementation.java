package com.mycomp.interface_inheritance;

public class CartImplementation implements CartDraft {
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
        CartImplementation cart = new CartImplementation();
        cart.getProductDetails();
        cart.getProductDetails_One();
        cart.getProductDetails_One(5);
        ProductDetailsDraft.getProductDetails_Two(5);
        cart.getProductDetails_Three();
        cart.addQuantity();
        cart.removeQuantity();
        cart.getTotalBillAmount();
    }

    @Override
    public int addQuantity() {
        System.out.println("Quantity is 10");
        return 0;
    }

    @Override
    public void removeQuantity() {
        System.out.println("Removed Quantity is 2");
    }

    @Override
    public void getTotalBillAmount() {
        System.out.println("This is getTotalBillAmount");
    }
}