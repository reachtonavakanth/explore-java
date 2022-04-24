package com.mycomp.interfaces;

public interface ProductDetailsDraft {
    public void getProductDetails();

    public String getProductDetails_One();

    public String getProductDetails_One(int num);

    public static String getProductDetails_Two(int num) {
        System.out.println("This is a static Class in Interface");
        return new String ("Welcome");
    }

    void getProductDetails_Three();

    //  private String getProductDetails_one(int num); - Compile time error in java 8

    //Since Java 8, we can have default and static methods in an interface.
    //  Since Java 9, we can have private methods in an interface.


}
