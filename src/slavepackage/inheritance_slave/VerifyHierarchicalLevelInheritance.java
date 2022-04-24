package slavepackage.inheritance_slave;

import com.mycomp.hierarchicalinheritance_master.Cart;
import com.mycomp.hierarchicalinheritance_master.ProductDetails;

public class VerifyHierarchicalLevelInheritance {
    // In this example Cart Class extends 'ProductDetails' which extends 'SearchProduct'


    public static void main(String[] args) {
        String productCode = "abc";
        Cart cart = new Cart();
        cart.addQuantity(10, productCode); // From Cart
        cart.removeQuantity(10,2,productCode);  // From Cart
        cart.getTotalBillAmount(97,8);  // From Cart
        cart.getProductRatings(productCode); // From ProductRatings

        System.out.println("********************************");

        ProductDetails productDetails = new ProductDetails();
        productDetails.getProductDetails(productCode); // From ProductDetails
        productDetails.getProductDiscountDetails(productCode); // From ProductDetails
        productDetails.getProductRatings(productCode); // From ProductRatings
    }
}