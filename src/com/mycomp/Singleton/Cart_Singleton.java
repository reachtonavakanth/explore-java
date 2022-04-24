package com.mycomp.Singleton;

import com.mycomp.singleinheritance_master.Cart;

public class Cart_Singleton {
public static Cart_Singleton instance;
int x=10;

  private Cart_Singleton(){
    System.out.println("Constructor of Cart_Singleton Class is invoked");
  }

 static public Cart_Singleton getInstance(){
    if (instance==null){
      instance= new Cart_Singleton();
    }
    return instance;
 }
}
