package day12;

import java.util.Scanner;

public class FizzNumberCheck {
    public static void main(String[] args) {
        int number = 45;
  if (number%5 ==0 ){
      System.out.println("Fizz Number");
  }else if (number%3 ==0){
            System.out.println("Buzz Number");
  }else if (number%3==0 && number%5==0){
      System.out.println("Fizz Buzz Number");
  }else {
            System.out.println("Not My Number");
        }


/*Scanner scan = new Scanner(System.in);
        System.out.println(" what is your number? ");
int number = scan.nextInt();
        if (number%5 ==0 ){
            System.out.println("Fizz Number");
        }if (number%3 ==0){
            System.out.println("Buzz Number");
        }if (number%3==0 && number%5==0){

        }else {
            System.out.println("Not My Number");
        }

 */






    }
}
