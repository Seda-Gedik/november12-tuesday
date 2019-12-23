package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("knock knock !! ");
        System.out.println("What is the password ? ");

       // entering password for the first time
        String password = scan.next();
         while (! password.equals("B15") ){
             System.out.println(" Wrong password!! Try again ");
             password = scan.next();

         }

        System.out.println(" Open sesame ");















    }
}
