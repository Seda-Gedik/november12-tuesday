package day12;

public class LoginTest {
    public static void main(String[] args) {

      /*  String userName = "Seda";
        int password = 617 ;

      if (userName.equals("Seda") && password==617){
            System.out.println("login successful");
        }else if (userName.equals("Serra")){
          System.out.println("user name is not correct");
      }else if (password==214){
          System.out.println("password is not correct");
      }
**/
      String userName , password ;
      userName = "user123";
      password = "pass123";

        if (userName.equals("user123") && password.equals("pass123") ){
            System.out.println("login successful");
        }else if (!userName.equals("user123") ){
            System.out.println("user name is not correct");
        }else if (password != "pass123"){
            System.out.println("password is not correct");
        }


    }
}
