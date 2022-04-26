package com.mycomp.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();

        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(102,"Rahul");
        exploreLinkedHashmap(map);
    }

    public static void exploreLinkedHashmap( LinkedHashMap<Integer,String> map){
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());

        System.out.println("Before invoking remove() method: "+map);
        map.remove(102);
        System.out.println("After invoking remove() method: "+map);

        LinkedHashMap<String,String> map1=new LinkedHashMap<String,String>();
        map1.put(null,null);

        for(Map.Entry m1:map1.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
