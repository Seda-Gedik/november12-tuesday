package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {

     /*
    * // Task 5 :
        Create a String variable season

        Assign value by asking user question : Enter your season Please !!

        Check the season using if statements without caring about the case
         If Spring —>  Hiking , Navruz , Alergy Season , Cool weather
         If Summer —>> Pool , Swimming , Beach , Vacation
        If Fall —>>>  barbecue, riding bike, just code!!halloween
        If Winter —>> CODE!!!!!! Ski , sledding , snowman
    * */


            Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your season please!");
        String season = scan.next();
if (season.equalsIgnoreCase("spring") ){
    System.out.println("Hiking , Navruz , Alergy Season , Cool weather");
}else if ( season.equalsIgnoreCase("summer") ){
    System.out.println("Pool , Swimming , Beach , Vacation");
}else if (season.equalsIgnoreCase("fall") ){
    System.out.println("barbecue, riding bike, just code!!halloween ");
}else if( season.equalsIgnoreCase("winter") ){
    System.out.println("CODE!!!!!! Ski , sledding , snowman");
}else {
    System.out.println("not valid");
}








    }
}
