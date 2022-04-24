package com.mycomp.interface_inheritance;

import com.mycomp.interfaces.ProductDetailsDraft;

public interface CartDraft extends ProductDetailsDraft {
    public int addQuantity();
    public void removeQuantity();
    public void getTotalBillAmount();
}
