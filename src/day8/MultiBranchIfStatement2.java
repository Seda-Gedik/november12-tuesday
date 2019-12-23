package day8;

public class MultiBranchIfStatement2 {
    public static void main(String[] args){

        // pseudo sudo code
        /*
         * given your currentSpeed ,speedLimit
         * check whether the current speed is
         *
         * more than 90 --> jail
         * more than 80 and less than 90 --> reckless driving
         * ---- start from here above two optional
         * more than 70 --> point taken
         * more than 60 and less than 70 --> warning
         * if not speeding keep driving
         */

        int currentSpeed = 75;
        if ( currentSpeed > 90 ) {
            System.out.println(" JAIL TIME! "); }
        else if (currentSpeed > 80 ){
            System.out.println(" Reckless Driving "); }
        else if (currentSpeed > 70 ) {
            System.out.println(" Point Taken! "); }
        else if (currentSpeed > 60 ){
            System.out.println(" Warning "); }
        else {
            System.out.println(" keep driving ");}




    }
}
