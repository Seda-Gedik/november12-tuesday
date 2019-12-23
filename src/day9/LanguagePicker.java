package day9;

import java.sql.SQLOutput;

public class LanguagePicker {
    public static void main(String[] args){
        System.out.println(" Welcome to Cybertek Call Center ");
        System.out.println(" Please select your language options from 1-7 ");

 String greeting = "";
 int languageOption = 5 ;

 if (languageOption == 1){
    greeting = "salam" ;
 } else if (languageOption == 2){
     greeting = "Hello" ;
 } else if (languageOption == 3){
     greeting = "Hola" ;
 } else if (languageOption == 4){
     greeting = "Privet" ;
 } else if (languageOption == 5){
     greeting = "Merhaba" ;
 } else if (languageOption == 6){
     greeting = "Szia" ;
 } else if (languageOption == 7) {
     greeting = "Bounjour";
 } else { greeting = "Unknown"; }

 // Hello,SDET
 greeting = greeting + " , SDET ";

     System.out.println(" This is how the greeting you get :" + greeting ) ;








    }
}
