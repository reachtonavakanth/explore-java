package com.mycomp.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        exploreTreeSet(set);
        getFirstAndLast();
    }

    public static void exploreTreeSet(TreeSet<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i = set.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void getFirstAndLast() {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: " + set.pollFirst());
        System.out.println("Lowest Value: " + set.pollLast());
    }
}
