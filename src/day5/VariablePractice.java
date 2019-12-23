package day5;

public class VariablePractice {

    public static void main (String[] args) {

    // 8 primitive
    /*

    block comment , everything in between will be seen as comment

    whole number:       byte,short,int,long
    fractional number:  float,double
    logical :           boolean (true,false)
    character :         char(single character in single quote)

    usually by default for whole number : just use int
    usually by default for fractional(kesirli) number : just use double

    IS String part of Primitive types? : NOOO!!!!
    String is sequence of character

    */

    // task : 1 Age calculator
    // given birth year,please calculate the age

       int birthYear = 1988;
       int currentYear = 2019;
       int age = currentYear - birthYear ;

       // I was born in year 1988 , and I am 31 years old;

        // System.out.println("I was born in year" + 1988 + " , and I am " + (2019-1988) + "years old");
               System.out.println("I was born in year " + birthYear + " ,and I am " + age + " years old");

         // task 2 : you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : You are driving 10 mph more than speed limit
        // speed limit as int,currentSpeed as int, overTheLimit as int


        int speedLimit = 75;
        int currentSpeed = 95;
        int overLimit = currentSpeed - speedLimit;

        System.out.println("My speed was " + currentSpeed + ", the limit was " + speedLimit + " and I was going " + overLimit + " Over the speed limit");

        System.out.println(" I was driving " + currentSpeed + " MHP and the speed limit was" + speedLimit
                + " MPH, " + " that means I was driving " + overLimit + " over the limit. " ) ;



















    }










}
