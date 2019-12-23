package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

    // checking for String equality should be always
    // done using equals method of the String

        // each and every String object you created will have this functionality
        // oneString.equals(anotherString) ----> true or false
        // equals method coming from String class

    // just comparing 2 String literal directly using equals method
    // This is somthing that you will rarely

        // System.out.println(  "Java".equals("java")      );
        String myStr ="Java" ;
        System.out.println( myStr.equals("Java")  );
        // IntellJ display originial as helper.its not part of your code
        //please ignore and keep typing,do not type original just your text
        String yourStr = new String("Java");
        System.out.println(" is my string same as your string ? ");
        // how to compare myStr to yourStr equality
        System.out.println(  myStr.equals( yourStr)  );

        // Create

        if ( myStr.equals("Java") ){
            System.out.println(" Correct Word! ");
        }else {
            System.out.println(" Say JAVA!! ");
        }










    }
}
