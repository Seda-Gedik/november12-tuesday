package day11;

import jdk.swing.interop.SwingInterOpUtils;

public class WarmUp1_LightOnOff {
    public static void main(String[] args) {
        /*
        * Create class called WarmUp1_LightOnOff
        Create a variable  targetOption as String and assign one of below options  for example bd
        You have 4 switches in your home to turn on
              Bd — bedroom
              Lr  — living room
              ki  — kitchen
              Ha— Hallway
        Use switch statement to write a program to print which room light is turned on
        For example if Bd was targetOption
            then print  you have turned on bedroom light
       * */

        // there is a targetOption that store my option
        // and it looks like it has 2 character so i use String as data type
        //String targetOption = "Ha" ;
        // what can be the data type of the variable inside switch
        // byte, short , int , char , String
        //switch (targetOption) {
//            Bd — bedroom
//            Lr  — living room
//            Ki  — kitchen
//            Ha— Hallway


  String targetOption = "Bd";
        System.out.println(" Turn on light ");
        switch (targetOption) {
            case "Bd" :
                System.out.println(" You have turned on bedroom light ");
                break;
            case "Lr" :
                System.out.println(" You have turned on living room light ");
                break;
            case "Ki" :
                System.out.println(" You have turned kitchen light ");
                break;
            case "Ha" :
                System.out.println(" You have turned on hallway light ");
                break;
            default:
                System.out.println(" No light ");

        }






    }
}
