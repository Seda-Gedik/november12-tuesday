package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexws{
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println(" enter your name! ");
    String name = scan.nextLine();
    int x = 0 ;
    while ( x < name.length() ){ // x <= name.length()-1 )

        if (x %2 == 1 ) {

            //System.out.println(x);
            System.out.println( name.charAt(x));
        }
        ++x;
    }















    }
}
