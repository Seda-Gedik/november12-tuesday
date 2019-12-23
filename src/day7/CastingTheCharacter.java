package day7;

public class CastingTheCharacter {
public static void main(String[] args){

    char grade = 'B' ; // only one character
    System.out.println(grade) ;


    // 'B' is represented by 66 in ASCII table
    // here type char is automatically widened to int
    // and stored as number
    int letterInNumber = 'B' ;
    System.out.println(letterInNumber) ;

    int letterInNumber2 = 'b' ;
    System.out.println(letterInNumber2) ;

    // --------------------------------
    // saving the number as char
    // so we can get the character representation
    //of the number in ASCII table
    char myFirstChar = (char) 100 ;
    System.out.println(myFirstChar) ;


    // find out your number of each character in your first name

    int myFirstWord = 'S' ;
    //System.out.println(myFirstWord) ;
    int mySecondWord = 'E' ;
    //System.out.println(mySecondWord) ;
    int myThirdWord = 'D' ;
    //System.out.println(myThirdWord) ;
    int myFourthWord = 'A' ;
    //System.out.println(myFourthWord) ;
    System.out.println(myFirstWord + " " + mySecondWord + " " + myThirdWord + " " + myFourthWord + " ");

char letterS = 's' ;
// adding a character to a int number will result in int
// (int) letterS  + 1
System.out.println( letterS + 1  ) ;
System.out.println(" " + letterS + 1   ) ;
















}









}
