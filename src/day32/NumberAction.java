package day32;

public class NumberAction {
    public static void main(String[] args) {

numberComparision(2,4);
repeaterString("Java" , 3);
repeaterString("Do not touch working code" , 2);
skipCountBy3Fromto50();
print1toX(5);
countDownByEvenNumberFrom50to0();
countDownByEvenNumberFromXToY(10,6);

    }



/**
 * Create static void methods as below
 *
 * numberComparision
 * this method has 2 parameters called num1 and num2
 * if num1 is more than num2 print num1 is more than num2
 * if num2 is more than num1 print num2 is more than num1
 * if num2 are equals num1 print they are equal
 */

public static void numberComparision (int num1, int num2){
     if (num1>num2){
         System.out.println(num1+ " is more than " + num2);
     }else if (num2>num1){
         System.out.println(num2+ " is more than " + num1);
     }else if (num2==num1){
         System.out.println("they are equal");

     }
    System.out.println();
}

/*
     * String repeater
     * this method has 2 parameters
     *     String strToRepeat and int count
     *    repeat printing the string as many time as <count> number define
     */


public static void repeaterString(String strToRepeat,int count){
    for (int i = 1; i <= count ; i++) {
        System.out.print(strToRepeat + " ");

    }
    System.out.println();
}

/*
     * skipCountBy3From0to50
     * * create a method that has no parameter
     * and skip count by 3 from 0 to 50
     */


public static void skipCountBy3Fromto50(){
    for (int i = 0; i < 50 ; i = i +3) {
        System.out.print(i + " ");
    }
    System.out.println();
}



/*This method will pring from 1 to the number user passed
 * print1toX
 * * create a method that has 1 int parameter called x
 * print from 1 to that number in one line
 * print an empty line after the print
 */

public static void print1toX(int x){
    for (int i = 1; i <= x ; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

    /*
     * countDownByEvenNumberFrom50to0
     * * create a method that has no parameter
     * and count Down By Even Number From 50 to 0
     * for example 50 , 48 , 46 .....0
     */

  public static void countDownByEvenNumberFrom50to0(){
      for (int i = 50; i >= 0  ; i--) {
          if (i%2==0){
              System.out.println(i + " ");
          }
      }
      System.out.println();
  }


    /**
     * instead of countDownByEvenNumberFrom50to0
     * now count Down By EvenNumber From x to y
     *
     * @param x
     * @param y
     */


public static void countDownByEvenNumberFromXToY(int x, int y){
    for (int i = x ; i >= y  ; i--) {
        if (i%2==0){
            System.out.print(i + " ");
        }
    }
    System.out.println();
}









}
