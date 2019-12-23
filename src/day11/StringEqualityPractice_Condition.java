package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {
/*
// create a variable called myStr and assign a value
        // check whether myStr value is Java
        // if true -->>  CORRECT WORD !!!!!!
        // If false  ---  SAY JAVA!!!!!!!


      String myStr = "Java" ;
      if ( myStr.equals("Java")  ) {
          System.out.println(" Correct Word!!");
      }else {
          System.out.println(" Say JAVA!!");
      }
**/


// update this program to add more condition
// using else if in the middle


/*
check the value of myStsr
if it is Java-->correct word
if it is Cava-->pumpkin
else say not Java nor pumpkin
 */

String myStr = "Para";
if ( myStr.equals("Java") ){
    System.out.println(" Correct Word!");
}else if (myStr.equals("Cava") ) {
    System.out.println(" Pumpkin!!");
}else{
    System.out.println("Say not Java nor Pumpkin!");
}



    }
}
