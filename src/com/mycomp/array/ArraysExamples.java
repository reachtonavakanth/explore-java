package com.mycomp.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExamples {

    public static void main(String[] args) {
        arrayExample();
        arrCopying();
        arraysClass();
    }

    public static void arrayExample() {
        int[] intArr1 = new int[2];

        int[] intArr2 = {10, 20, 30};

        for (int i = 0; i < intArr1.length; i++) {
            System.out.println(intArr1[i]);
        }
        System.out.println("*********");
        for (int m : intArr2) {
            System.out.println(m);
        }
    }

    public static void arrCopying() {
        int[] copyFrom = {-2, -1, 0, 1, 2, 3, 4, 5};
        int[] copyTo = new int[6];

        System.arraycopy(copyFrom, 2, copyTo, 0, 6);
        for (int m : copyTo) {
            System.out.println(m);
        }

    }

    public static void arraysClass() {
        int[] arr1 = {-1, 0, 1, 2, 3, 9, 10, 4, 5};

        // Arrays.sort(arr1);
        System.out.println("*********");
        System.out.println(Arrays.binarySearch(arr1, 0));
        System.out.println(Arrays.binarySearch(arr1, 3, 8, 9));

        int[] arr2 = {-1, 0, 1, 2, 3, 9, 10, 4, 5};

        int[] arr3 = {9, 10, 4, 5};
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.compare(arr1, arr3));

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr1, 1, 5)));
        System.out.println(Arrays.copyOfRange(arr1, 1, 5));

        Arrays.asList(arr1);
    }
}
