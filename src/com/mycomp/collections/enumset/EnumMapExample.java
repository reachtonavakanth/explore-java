package com.mycomp.collections.enumset;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    public static void main(String[] args) {

        EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);
        map.put(Days.MONDAY, "1");
        map.put(Days.TUESDAY, "2");
        map.put(Days.WEDNESDAY, "3");
        map.put(Days.THURSDAY, "4");
        // print the map
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }


}
