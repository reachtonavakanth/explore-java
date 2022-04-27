//If the superclass method does not declare an exception, subclass overridden method
// cannot declare the checked exception but it can declare unchecked exception


//If the superclass method declares an exception, subclass overridden method can declare same,
// subclass exception or no exception but cannot declare parent exception.


package com.mycomp.exceptions;

public class InheritanceChildClass extends InheritanceParentClass{

   /* @Override
    public void method1() throws  Exception{
        super.method1();

    }*/
// Above lines of code gives compile time error
    @Override
    public void method1() throws ArithmeticException {
        super.method1();
        System.out.println("This is method 1 from InheritanceChildClass ! ");

    }


   /* @Override
    public void method2() throws RuntimeException {
        super.method2();
        System.out.println("This is method 2 from InheritanceChildClass ! ");
    }*/

    // The above works fine
    @Override
    public void method2() throws StringIndexOutOfBoundsException {
        super.method2();
        System.out.println("This is method 2 from InheritanceChildClass ! ");
    }
    // The above works fine

   /* @Override
    public void method2() throws Exception {
        super.method2();
        System.out.println("This is method 2 from InheritanceChildClass ! ");
    }*/

// Above lines of code gives compile time error

    public static void main(String[] args) {

        InheritanceChildClass obj = new InheritanceChildClass();
        obj.method1();
        obj.method2();
    }
}