package day7;

import java.util.Scanner;

public class emailBuilder2 {
    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
 System.out.println("Enter your first name,last name,company seperated by space : ");

 String firstName, lastName, company, email;
 firstName = scan.next();
 lastName = scan.next();
 company = scan.next();
        email = firstName + "_" + lastName + "@"+ company + ".com" ;

        System.out.println(" My name is " + firstName + " " + lastName + " and I work " + company + " " + " and my email is " + email );


    }

}
