package day31;

import java.util.Scanner;

public class MethosPractice_4 {





    // create a class called MeyhodPractice4

        // no need for object when being called                : static
        // it should be accessible anywhere in your project    : public
        // it does not return any value                        : void
        // does not need any external data when being called   : (nothing inside)

        // create a method called countDownFrom20tillOne
        // create a method to print odd numbers from 1-100 : printOddNumbers1to100()
        // create a method to spell your name : Seda --> s-e-d-a



    public static void main(String[] args) {

     countDownFrom20tillOne();
     printOddNumbers1to100();
     yourName();
    }

    public static void countDownFrom20tillOne(){

        for (int x = 20; x > 0 ; x--) {
            System.out.print(x + " ");
        }

        System.out.println();


    }

    public static void printOddNumbers1to100(){

        for (int i = 0; i <= 100 ; i++) {
            if(i%2 ==1){
                System.out.print(i + " ");
            }

        }

        System.out.println();
    }

    public static void yourName(){
        String name = "Seda";
        System.out.println(name);
    }



}
