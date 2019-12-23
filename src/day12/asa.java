package day12;

public class asa {
    public static void main(String[] args) {
        /*   // TASK 4
        String str = "abc" ;
        str.equals("abc") —> true       ! str.equals("abc") —>> false
        Create class called LoginTest with main method
                Create 2 String variable called userName , password
        and do following
        // your correct username password is  user123  and pass123
        Check if your username and password correct
        If so print login successful
        If not
        Check whether your username correct
        if not print  , username is not correct
        Check your password is correct or not
        If not print password is not correct
     **/
  String userName = "abc123";
//storing the result of equality check into boolean variable
  boolean userNameCorrect = userName.equals("ABC123"); //this will be true or false according to condition
//printing the variable to see what





  /* String myName = "Seda";
   boolean myNameCorrect = myName.equals("SEDA");
        System.out.println( myNameCorrect);
   **/

        String name = "Seda";
   // I want to store the result of checking name into a variable
        boolean nameEqualWithoutCase = name.equalsIgnoreCase("seda");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println("nameEqualsWithoutCase");

    // here directly printing without saving into variable

//                   this will eventually become true or false
        //System.out.println( name.equalIgnoreCase);


    }
}
