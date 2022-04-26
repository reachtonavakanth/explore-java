package com.mycomp.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Three");
        set.add(null);

        exploreHashSet(set);

        removeElements();

        setFromAnotherCollection();
    }

    public static void exploreHashSet(HashSet<String> set) {

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void removeElements() {
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: " + set);
        //Removing specific element from HashSet
        set.remove("Ravi");
        System.out.println("After invoking remove(object) method: " + set);
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);
        //Removing elements on the basis of specified condition
        set.removeIf(str -> str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }

    public static void setFromAnotherCollection(){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet<String> set=new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
