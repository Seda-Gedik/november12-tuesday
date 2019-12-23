package day8;

public class IfElseStatement {
    public static void main(String[] args){

       int speedLimit = 60 ;
       int currentSpeed = 45 ;
    // If the current speed is more than speed limit
    // get pulled over by the police
    // given ticket by the police
    // taken away some points on your license
    // go to court
       boolean IamSpeeding = ( currentSpeed > speedLimit );
    // inside parenthesis we can only put
    // boolean value : true or false
    // boolean variable
    // any expression that return boolean value

    //  if ( IamSpeeding){
    // if ( true){
        if(currentSpeed > speedLimit){

           System.out.println("get pulled over by the police ");
           System.out.println("given ticket by the police ");
           System.out.println("taken away some points on your license ");
           System.out.println("go to court "); }
       else {
           System.out.println("go shopping");
           System.out.println("buy iceCream ");
           System.out.println(" enjoy your day "); }
       System.out.println(" THE END ");

    // if not over the limit
    // go shopping
    // buy icecream


    // outside if statement, say the end

















    }

}
