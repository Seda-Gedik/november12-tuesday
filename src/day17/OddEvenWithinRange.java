package day17;

public class OddEvenWithinRange {
    public static void main(String[] args) {
        // write a program to print out a even number from 0 to 50 ;
        // write a program to print out a odd number from to 50 ;

        int count = 0 ;
        while (count <= 50) {
            System.out.print(count + " ");
            count += 2 ;
        }
        System.out.println("--------------------");

        int cnt = 1 ;
        while(cnt <= 50){
            System.out.print(cnt + " ");
            cnt += 2 ;
        }

        System.out.println("------------");
        int cnt3 = 0;

        while (cnt3 <= 50) {

            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;
        }









    }
}
