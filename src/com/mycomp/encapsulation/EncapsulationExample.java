package com.mycomp.encapsulation;

public class EncapsulationExample {

    private String name;

    private int age;

    private String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("Input number is invalid");

    }

    public String getMobileNumber() {

        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber.length() == 10) {
            this.mobileNumber = mobileNumber;
        } else {
            System.out.println("Input number is invalid");
        }
    }

    }
