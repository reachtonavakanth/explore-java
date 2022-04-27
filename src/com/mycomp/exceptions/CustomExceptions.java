package com.mycomp.exceptions;

public class CustomExceptions {

    public static void main(String[] args) {
        // addExceptionMessage(-7);

        addExceptionMessageTryCatch();
    }

    public static void addExceptionMessage(int num) {
        if (num > 0) {

        } else {
            throw new ArithmeticException("Please try with another number");

        }
    }

    public static void addExceptionMessageTryCatch() {
        try {
            System.out.println("Print Exception");

            throw new LoginError("Login Failed !");
        } catch (LoginError e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
