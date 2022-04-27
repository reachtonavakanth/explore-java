package com.mycomp.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        // exploreException();
        // exploreExceptionInCatch();
      //  multiCatchBlocks();
        nestedTryCatch();
    }

    public static void exploreException() {
        // int num= 100/0;
        // Above line will probably throw exception
        try {
            int num = 100 / 0;
            System.out.println("After Exception !");  // This will not be printed
        } catch (ArithmeticException e) {
            System.out.println("Catching Arithmetic Exception " + e);
            System.out.println("Catching Arithmetic Exception " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void exploreExceptionInCatch() {
        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
            str.length();
            System.out.println("This is in Catch Block ! ");
        }
    }

    public static void multiCatchBlocks() {
        try {
            int a[] = new int[5];

            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

    public static void nestedTryCatch() {
        //outer try block
        try {
            //inner try block 1
            try {
                System.out.println("going to divide by 0");
                int b = 39 / 0;
            }
            //catch block of inner try block 1
            catch (ArithmeticException e) {
                System.out.println(e);
            }
            //inner try block 2
            try {
                int a[] = new int[5];
                //assigning the value out of array bounds
                a[5] = 4;
            }
            //catch block of inner try block 2
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");
        }
        //catch block of outer try block
        catch (Exception e) {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }
}