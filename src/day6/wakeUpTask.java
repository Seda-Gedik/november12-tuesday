package day6;

import java.util.Scanner;

public class wakeUpTask {
    public static void main(String[] args) {


        //double regularPrice;
        //double salePrice;
        //double discount;

        // If you have variables with same data type, you can declare them in on line like this;
        double regularPrice,salePrice,discount;

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the regular price");
        regularPrice = scan.nextDouble();


        System.out.println("What is the discount rate");
        discount = scan.nextDouble();

        salePrice = regularPrice - regularPrice * discount;

        System.out.println("regular price is" +regularPrice
                + "$ , discount is "+discount+ "and your got deal for "+salePrice+ "    $");
        double discountPercentage = scan.nextDouble();

























    }




































}
