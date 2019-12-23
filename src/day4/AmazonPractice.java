package day4;

public class AmazonPractice {
    public static void main(String[] args) {


        // Extract some data out of this sentence and store it into a variable
        //String productName
        //String model
        //int version
        //float price

        // I saw fire HD8 hands-free Alexa for $79.99

        String productName = "Fire ";
        String model = "HD ";
        int version = 8;
        float price = 79.99f;

        System.out.println("product name is " + productName);
        System.out.println("product model is " + model);
        System.out.println("I saw " + productName + " "+ model + version + " hands-free with Alexa for " + price );


    }
}
