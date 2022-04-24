package com.mycomp.encapsulation;

public class ValidatEncapsulation {

    public static void main(String[] args) {
        EncapsulationExample ee= new EncapsulationExample();
        System.out.println(ee.getName());
        System.out.println(ee.getAge());
        System.out.println(ee.getMobileNumber());

        ee.setName("Test 1");
        ee.setAge(20);
        ee.setMobileNumber("7865843289");

        System.out.println(ee.getName());
        System.out.println(ee.getAge());
        System.out.println(ee.getMobileNumber());
    }
}
