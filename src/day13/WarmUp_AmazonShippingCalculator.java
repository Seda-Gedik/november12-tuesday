package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
        /*
         * Amazon has 2 type of user one is Prime member and another is regular member
         * prime member get free shipping in all purchase no matter the amount
         * regular member user get free  shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         *
         * */

        String memberType = "member" ;
        double amount = 45.99d ;
        int shippingFee =0 ;

        if (memberType.equalsIgnoreCase("PRIME MEMBER") ) {
            System.out.println("You Get 1 Day Free Shipping");
            System.out.println("your final prise is " + amount);
            // else if ( ! memberType.equalsIgnoreCase("PRIME MEMBER") && amount > 25 ) bu sekilde de kullanilabilinir
            // asagidakiyle ayni anlamda sace daha uzun versiyonu kullandi
            // ! isareti olumsuzluk anlaminda prime member degil demek istiyor
            //}else if (amount > 25){
        }else if ( ! memberType.equalsIgnoreCase("PRIME MEMBER") && amount > 25){

            System.out.println("Not a prime member but you order is more than 25 ");
            System.out.println("You got free shipping on amount " + amount );
        }else {
            System.out.println("Do you wanna sign up for prime member? ");
            shippingFee =5 ;
            amount = amount + shippingFee ; // amount += shippingfee ---->> bu kisa yolu ikisinide kullanabilirisn
            System.out.println("Your final amount " + amount );
        }






    }
}
