package com.mycomp.singleinheritance_master;

public class VerifySingleInheritance {

    // In this example Cart Class extends 'ProductDetails'

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.getProductDetails("abc");  // From ProductDetails
        cart.getProductDiscountDetails("abc");  // From ProductDetails
        cart.addQuantity(10, "abc"); // From Cart
        cart.removeQuantity(10,2,"abc");  // From Cart
        cart.getTotalBillAmount(97,8);  // From Cart
    }
}