package com.mycomp.collections.enumset;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {

    public static void main(String[] args) {
        Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);
        // Traversing elements
        Iterator<Days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        Set<Days> set1 = EnumSet.allOf(Days.class);
        System.out.println("Week Days:"+set1);
        Set<Days> set2 = EnumSet.noneOf(Days.class);
        System.out.println("Week Days:"+set2);
    }
}
