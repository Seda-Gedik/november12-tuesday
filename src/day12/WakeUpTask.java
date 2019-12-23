package day12;

public class WakeUpTask {
    public static void main(String[] args) {

       /* // WAKE UP TASK :
        Create a variable to store the weather of your city right now :
        And write a if else if else statement to do following
        If Weather Sunny ——>>  Code in Sunny weather
        If Weather Rainy ——>>  Code in Rainy weather
        If Weather Cloudy  ——>>  Code in Cloudy weather
        If Weather Snowy  ——>>  Code in Snowy weather
        Else   —>> rain or shine just keep coding anyway !!!
**/
/*
     String weather = "rainy" ;
        if (weather=="sunny"){
            System.out.println("sunny weather");
     } else if (weather=="rainy"){
            System.out.println("rainy weather");
        }else if (weather=="cloudy"){
            System.out.println("cloudy weather");
        }else if (weather=="snowy") {
            System.out.println("snowy day");
        } else {
            System.out.println("Bad Mood!!");
        }
**/
   String weather = "rainy";
   if (weather.equals("sunny") ){
       System.out.println("sunny weather");
   }else if (weather.equals("rainy")){
       System.out.println("rainy weather");
   }else if (weather.equals("cloudy")){
       System.out.println("cloudy weather");
   }else if (weather.equals("snowy")){
       System.out.println("snowy weather");
   } else{
       System.out.println("Bad mood");
   }














    }
}
