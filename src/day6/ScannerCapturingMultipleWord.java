package day6;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {

 Scanner blabla = new Scanner(System.in);

 //System.out.println("What is your name ?");
 //nextline method of Scanner is used to capture whole line

  //String name = blabla.nextLine();

  //System.out.println("You have entered " + name);

  // task 4
  // use nextLine to ask your bio
  // Whats your name
  // which city you live in ,inculuding satte
  // what is your street address







System.out.println(" What is your name ? ");
String name = blabla.nextLine();
System.out.println("you have entered : " + name);

System.out.println(" Which city do you live ,inculuding state ?");
String cityAndState = blabla.nextLine();
System.out.println("you have entered City and State : " + cityAndState );

System.out.println("What is your street address ? ");
String address = blabla.nextLine();
System.out.println("you have entered address : " + address );






















    }
}
