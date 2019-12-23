package day5;
import java.util.Scanner;

public class TemperatureConventer {

    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temprature in F ? " );
        double fahrenheit = scan.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit -32);

        // fahrenheit 80 is 23 celsius

        System.out.println("fahrenheit " + fahrenheit + " is " + celsius + " in celsius");












    }














}
