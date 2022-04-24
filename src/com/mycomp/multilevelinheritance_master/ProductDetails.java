package com.mycomp.multilevelinheritance_master;

public class ProductDetails extends SearchProduct{

    public void getProductDetails(String productCode){
        double MRPPrice=100;
        double NetPrice=97;
        System.out.println("Product details are as : ");
        System.out.println("Product Code : "+ productCode);
        System.out.println("MRP Price : "+ MRPPrice);
        System.out.println("Net Price : "+ NetPrice);
    }

    public void getProductDiscountDetails(String productCode){
        double discount = 3.0;
        System.out.println("Discount : "+ discount);
    }
}
