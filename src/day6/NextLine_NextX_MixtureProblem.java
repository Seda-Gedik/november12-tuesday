package day6;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {

        Scanner  blabla = new Scanner(System.in);

        System.out.println("What is your name ?"); // step 1
        String name = blabla.nextLine(); // step 2
        System.out.println("Your name is " + name); //step 3


        System.out.println("What is your age ?");
        //String age = blabla.nextLine();
        int age = blabla.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("What is your address ? ");
        String address = blabla.nextLine();
        System.out.println("Your address is " + address);


























    }



















}
