package com.mycomp.collections.map;

import java.util.*;

class HashtableExample {
    public static void main(String args[]) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");
        hm.put(103, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

// Null is not allowed in Hashtable
     
        Hashtable<String, String> hm1 = new Hashtable<String, String>();

        hm1.put(null, "Amit");
        hm1.put("xyz", null);


        for (Map.Entry m : hm1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}  