package day17;

import java.util.Scanner;

public class WakeUpTask1 {
    public static void main(String[] args) {

        /*
        create a class called WakeUp_NameCorrector with main
                Create a String variable to store your name in any case combination
        for example  jon jOn jON  any of them :
        Create a variable called name2
        make your first letter uppercase then rest lowercase
        jon  ---> Jon    arya -->> Arya
        Optionally ask your name from Scanner
        Optionally ask your full name
                -->> then make your full name first letter uppercase the rest lowercase
         */

             //0123
String name = "sEdA";
// SUBSTRING METHOD COPY THE PART OF STRING INSIDE ANOTHER STRING
// IT HAS 2 VERSION :
//1. START WITH CERTAIN INDEX AND END AT ENDING INDEX
//2. START WITH CERTAIN INDEX THEN HET THE REST OF THE STRING


// GET THE FIRST CHARACTER -->MAKE IT UPPERCASE
// GET THE REST OF THE CHARACTERS STARTING FROM 2ND CHARACTER
// THEN MAKE IT LOWERCASE
//EVENTUALLY CONCATENATE THEM

        /*
String nameFixed = (name.charAt(0)+"").toUpperCase();
   nameFixed = nameFixed +name.substring(1).toLowerCase();
        */

String nameFixed =name.toLowerCase().substring(0,1) ;
   nameFixed += name.substring(1).toLowerCase() ;

        System.out.println("nameFixed = " + nameFixed);





// MAKE WHOLE NAME UPPERCASE THE GET THE FIRST CHARACTER
// GET THE REST OF THE CHARACTERS STARTING FROM 2ND CHARACTER
// THEN MAKE IT LOWERCASE
//EVENTUALLY CONCATENATE THEM






























    }
}
