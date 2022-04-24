package com.mycomp.multipleinheritance;

public class VerifyMultipleinheritance implements CartDraft,ProductDetailsDraft,SearchProductDraft {
    @Override
    public int addQuantity() {
        return 10;
    }

    @Override
    public void removeQuantity() {
        System.out.println("Removing Quantity");
    }

    @Override
    public void getTotalBillAmount() {
        System.out.println("This is getTotalBillAmount method ");
    }
    @Override
    public void getProductDetails(){
        System.out.println("This is getProductDetails");
    }
    @Override
    public void getProductBasicInfo(String productCode) {

        System.out.println("This is getProductBasicInfo");
    }
}
