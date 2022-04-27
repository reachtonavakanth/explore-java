package com.mycomp.collections.collectionclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionClassExample {

    public static void main(String[] args) {
        exploreCollectionClass();
        exploreMaxMin();
    }


    public static void exploreCollectionClass(){
        List<String> list = new ArrayList<String>();
        list.add("C");
        list.add("Core Java");
        list.add("Advance Java");
        System.out.println("Initial collection value:"+list);
        Collections.addAll(list, "Servlet","JSP");
        System.out.println("After adding elements collection value:"+list);
        String[] strArr = {"C#", ".Net"};
        Collections.addAll(list, strArr);
        System.out.println("After adding array collection value:"+list);
    }
    public static void exploreMaxMin() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(46);
        list.add(67);
        list.add(24);
        list.add(16);
        list.add(8);
        list.add(12);
        System.out.println("Value of maximum element from the collection: "+Collections.max(list));
        System.out.println("Value of maximum element from the collection: "+Collections.min(list));
        list.add(67);
        list.add(67);
        list.add(67);
        System.out.println("Collections.frequency(list,67)   --- > "+Collections.frequency(list,67));

        Collections.sort(list);
        System.out.println("After sorting elements collection value: "+list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After reverseOrder collection value: "+list);
    }



    }
