package com.mycomp.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(4,"Orange");

        exploreHashmap(map);
    }

    public static void exploreHashmap(HashMap<Integer,String> map){
        map.putIfAbsent(103, "Gaurav");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> mapNew=new HashMap<Integer,String>();
        mapNew.put(104,"Ravi");
        mapNew.putAll(map);

        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //key-based removal
        map.remove(100);

        map.replace(102, "Gaurav");

    }
}
