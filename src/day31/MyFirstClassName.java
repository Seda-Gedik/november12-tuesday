package day31;

public class MyFirstClassName {
   // do not create a method
    public static void main(String[] args) {
// call directly since we are in same class
        sayHelloWorld7Times();
// alternatively call using class name
        MyFirstClassName.sayHelloWorld7Times();
// you can call static method of other class
// using classname.methodname(..)
        MethodIntro.sayHello();
        MethodPractice.calculateMathProblem();
    }

public static void sayHelloWorld7Times() {

// CAN NOT CREATE 2 METHODS WITH SAME EXACT METHOD HEADER
    // EVEN THOUGH IT HAS DIFFERENT THINGS INSIDE the method
//    public static void sayHelloWorld7Times() {
//        System.out.println("DO SOMETHING DIFFERENT");

    // piece of code that you want to resume goes here
    // 3 print line statement
    System.out.println("Hello world line 1 ");
    System.out.println("Hello world line 2 ");
    System.out.println("Hello world line 3 ");
// 2 print statement
    System.out.print("Hello world line 4 ");
    System.out.print("Hello world line 5 ");
// 2 print line statement
    System.out.println("Hello world line 6 ");
    System.out.println("Hello world line 7 ");

}

}
    // Create a method called print 7 line of hello and call it sayHelloWorld7Times