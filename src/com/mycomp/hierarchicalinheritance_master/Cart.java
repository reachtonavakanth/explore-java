package com.mycomp.hierarchicalinheritance_master;

public class Cart extends ProductRatings {
    double total=0.00;

    public int addQuantity(int newQuantity, String productCode ){
    int finalQuantity = newQuantity;
        System.out.println("Quantity is : "+ finalQuantity);
        return finalQuantity;
    }
    public void removeQuantity(int currentQuantity,int quantityToRemove, String productCode ){
        int latestQuantity = currentQuantity-quantityToRemove;
        System.out.println("Updated quantity after removing "+quantityToRemove+" : "+ latestQuantity);
    }
    public void getTotalBillAmount(double NetPriceOfNewProduct, int finalQuantity){
        total= total+NetPriceOfNewProduct*finalQuantity;
        System.out.println("The total Bill value is "+ total);
    }
}