package com.mycomp.hybridinheritance;

public class VerifyHybridIheritance implements ProductDetailsDraft,SearchProductDraft{

    @Override
    public int addQuantity() {
        System.out.println("This is addQuantity");
        return 0;
    }

    @Override
    public void removeQuantity() {
        System.out.println("This is removeQuantity");
    }

    @Override
    public void getTotalBillAmount() {
        System.out.println("This is getTotalBillAmount");
    }

    @Override
    public void getProductDetails() {
        System.out.println("This is getProductDetails");
    }

    @Override
    public void getProductBasicInfo(String productCode) {
        System.out.println("This is getProductBasicInfo");
    }
}
