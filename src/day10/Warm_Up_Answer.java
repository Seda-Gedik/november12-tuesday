package day10;

public class Warm_Up_Answer {
    public static void main(String[] args ){

String myAnswer = "" ;
int myNumber = 617 ;
int remainder = myNumber % 5; // bunun burda pek bi etkisi yok olmasada calisiyor
                              // eger if in icinde remainder olarak kullancaksam tekrar gerekebilir,ama kalan kismi bulmayi if in icinde zaten yapmis oldum.

if (myNumber%5 == 0 ){
    myAnswer = "Fizz Number";
}
else {
    myAnswer = "Not Fizz Number" ;
}






System.out.println("Print my number is " + myNumber + " It is " + myAnswer);

    }
}
