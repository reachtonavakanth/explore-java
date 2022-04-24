package com.mycomp.multilevelinheritance_master;

public class SearchProduct {
    public void getProductBasicInfo(String productCode){
        boolean availability = true;
        String discount = "Yes";

        System.out.println("Availability : "+ availability);
        System.out.println("Discount : "+ discount);
    }
}
