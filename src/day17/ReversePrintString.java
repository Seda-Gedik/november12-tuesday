package day17;

import java.util.Scanner;

public class ReversePrintString {
    public static void main(String[] args) {

   String name = "Seda yesilyurt gedik";
/*
    int myName = 0 ;
    while ( myName < name.length()){
        System.out.print("index " + myName + " : ");
        System.out.println(name.charAt(myName));
        ++myName;
    }
// bu adimi duzene sokuyor siraliyor
*/
Scanner scan = new Scanner(System.in);
        System.out.println(" enter your name ! ");
String name1 = scan.nextLine();








int lastCharacterIndex = name.length()-1;
while (lastCharacterIndex >=0 ){
    System.out.println("index " + lastCharacterIndex + " : " + name.charAt(lastCharacterIndex));
    --lastCharacterIndex ;
}











    }
}
