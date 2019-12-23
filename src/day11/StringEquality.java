package day11;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {

        String name = "Seda" ; // String literal
        String name2 = new String("Seda");
        String name3 = "Seda" ;


        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("Using == Method");
        System.out.println( name==name2 );
        System.out.println( name==name3 );

// The correct way of comparing String to get consistent result is
// using one of the String object behaviour / method called
// equals method
// strl.equals(str2)
        System.out.println("Using Equals Method");
        System.out.println( name.equals(name2) );
        System.out.println( name.equals(name3) );










    }
}
