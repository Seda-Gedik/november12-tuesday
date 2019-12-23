package day17;

public class OnlyOddNumber {
    public static void main(String[] args) {

    int num = 100 ;
    while (num >0){
        // if num divided by 2 have remainder
        // for example 5/2=2 1 remain 5%2=1  1!=0
        if ( num %2 !=0 ){ // num %2 == 1 does same thing
            System.out.println((num + " is odd number"));
        }
        -- num ;

    }






    }
}
