package day10;

import java.util.Scanner;

public class SeasonAction_Scanner {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
        System.out.println(" Hey what is the season?? ");

        String season = scan.next(); // "java" ;
//byte,short,int,char,String
        switch (season) {
            case "spring" :
                System.out.println("Hike,Easter,Nawruz,Blossom");
                break;
            case "summer" :
                System.out.println("Swim,Vocation,BBQ,Holiday");
                break;
            case "Fall" :
                System.out.println("Black Friday,Hiking,Harvest,Halloween");
                break;
            case "winter" :
                System.out.println("Snowboarding,Ski,Christmas,New Year");
                break;
            default :
                System.out.println("Nothing!");


        }












    }
}
