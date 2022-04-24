package slavepackage.inheritance_slave;

import com.mycomp.multilevelinheritance_master.Cart;
import com.mycomp.multilevelinheritance_master.ProductDetails;

// Imports are Added because we are accessing Cart,ProductDetails details in a different Package

public class VerifyMultiLevelInheritance {
    // In this example Cart Class extends 'ProductDetails' which extends 'SearchProduct'


    public static void main(String[] args) {
        String productCode = "abc";
        Cart cart = new Cart();
        cart.getProductBasicInfo(productCode); // From SearchProduct
        cart.getProductDetails(productCode);  // From ProductDetails
        cart.getProductDiscountDetails(productCode);  // From ProductDetails
        cart.addQuantity(10, productCode); // From Cart
        cart.removeQuantity(10,2,productCode);  // From Cart
        cart.getTotalBillAmount(97,8);  // From Cart

        System.out.println("********************************");

        ProductDetails productDetails = new ProductDetails();
        productDetails.getProductBasicInfo(productCode); // From SearchProduct
        productDetails.getProductDetails(productCode); // From ProductDetails
        productDetails.getProductDiscountDetails(productCode); // From ProductDetails
       // productDetails.addQuantity(10, productCode); // From Cart
        // The above line will throw compile time error because  ProductDetails doesn't have addQuantity method or no inheritance relation to access it.  re;a
    }
}