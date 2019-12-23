package day6;

import java.util.Scanner;

public class ScannerCapturingMultipleWorld {
    public static void main(String[] args){

  Scanner blabla = new Scanner(System.in);


  System.out.println("What is your name ? "); // step 1
  String name = blabla.next(); // step 2 // it will only capture first word (sepatared by space)

  String anotherWord = blabla.next(); // step 3

  //String thirdWord = blabla.next(); // step 4

  int age = blabla.nextInt(); // step 5


  System.out.println(" you have entered " + name);
  //System.out.println("Another word is " + anotherWord);
  //System.out.println(" you have entered " + thirdWord);

  System.out.println("You have entered age " + age);














    }
}
