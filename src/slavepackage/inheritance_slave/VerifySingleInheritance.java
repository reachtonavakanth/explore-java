package slavepackage.inheritance_slave;
import com.mycomp.singleinheritance_master.Cart; // Added because we are accessing Cart details in a different Package

public class VerifySingleInheritance {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.getProductDetails("abc");
        cart.getProductDiscountDetails("abc");
        cart.addQuantity(10, "abc");
        cart.removeQuantity(10,2,"abc");
        cart.getTotalBillAmount(97,8);
    }
}
