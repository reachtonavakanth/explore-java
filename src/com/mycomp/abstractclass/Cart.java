package com.mycomp.abstractclass;

abstract public class Cart {

    public Cart(){
        System.out.println("This is Abstract Class Constructor");
    }

  abstract public void m1();
  public static void m2(){
      System.out.println("In static M2");
  }
  public final void m3(){
      System.out.println("In Final M3");
  }

  public void M4(){
      System.out.println("In M4");
  }


}
