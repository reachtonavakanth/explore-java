package com.mycomp.recurrsion;

public class RecursiveExample {


    public static void main(String[] args) {
identifynumber(100);
    }

    public static void identifynumber(int num){
        if(num == 0){
            System.out.println("Found the Value");
        }
        else {
            num--;
            identifynumber(num);
        }

    }
}
