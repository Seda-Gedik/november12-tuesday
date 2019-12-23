package day10;

public class SeasonAction {
    public static void main(String[] args) {

        /*
         * What do you do in each season
         *
         * Spring -->>> Hike ! Easter , Nawruz, Blossom
         * Summer -->>> Swim , Vacation , BBQ , Holiday
         * Fall   -->>> Black Friday , Hiking , Harvest , Halloween , Shopping
         * Winter --->> Snowboarding , Ski , Christmas , New Year
         *
         * */

String season = "java" ;
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
