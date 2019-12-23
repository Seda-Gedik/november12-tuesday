package day11;

public class aa {
    public static void main(String[] args) {


    int x = 55;
        System.out.println("------- x>100 || x<10 ");
        System.out.println( x>100 || x<10);
        System.out.println( x>10 && x<60 );

// more than 2 conditions at the same time , 3 conditions
                           // true || false ----> true
        System.out.println( true || false || false );
                           // true && false ----> false
        System.out.println( true && true && false );
                           // false|| false->||true---> true
        System.out.println( x==50 || x==51 || x==55 );

// check //
// x is more than 50 //
// and x is not equal 52 //
// or x equal to 57

        System.out.println( x>50 && x!= 52 || x== 57);
        // "and" means &&, "or" means ||, "equality" means ==, "inequality" means !


    }
}
