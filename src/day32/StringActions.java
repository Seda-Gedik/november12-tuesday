package day32;

public class StringActions {
    public static void main(String[] args) {


//reversePrintMyOwnName();
//String name = "SEDA";



printStringWithDashInBetween("hasan");
printStringWithDashInBetween("arya");
printStringWithDashInBetween("tolkun");
printStringWithDashInBetween("lisa");
printStringWithDashInBetween("gulbara");


         }

    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one SEDA ---> S-E-D-A
    // logic : keep concatenating  - after each character
    // when it comes to last character don't add it


public static void printStringWithDashInBetween(String name) {
    //String name = "Tokun" ;
    for (int i = 0; i < name.length(); i++) {
        System.out.print(name.charAt(i) );
        // if I am not at last index then I print -
        if (i != name.length() - 1) {
            System.out.print("-");
        }
    }
    System.out.println();
}
    /*
       reversePrintMyOwnName
         create a method that has no parameter
         and print your name in reversed order
    */

    public static void reversePrintMyOwnName () {
        //            0123
        String name = "SEDA";
        // start from last character and print towards first character
        for (int i = name.length() - 1; i >= 0; i--) {
            // System.out.print(name.charAt(i) );
        }


    }





}
