package com.mycomp.multipleinheritance;

import com.mycomp.interfaces.ProductDetailsDraft;

public interface CartDraft {
    public int addQuantity();
    public void removeQuantity();
    public void getTotalBillAmount();
}
