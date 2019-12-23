package day13;

import java.util.Scanner;

public class WarmUp_AmazonShippingCalculator2 {
    public static void main(String[] args) {
       // create a boolean store the result of youWantToShop
       // if yes,do you want to go to Store or do you wanna shop onLIne
        // if user do not wanna shop at all,print good job stay home coding!!

        boolean youWantToShop = true;
        String preference = "Online";
        // asagidaki iki yontemde dogru equalty i bulmak icin hangisini tercih edersen
        //if (youWantToShop)

        if (youWantToShop == true ) {

            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping! ");
            } else {
                System.out.println("Going to online for shopping! ");
            }
        }else{
                System.out.println("good job stay home coding!! ");
        }



    }
}
