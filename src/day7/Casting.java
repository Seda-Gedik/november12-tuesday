package day7;

public class Casting {
    public static void main(String[] args){

//int num =10;
//int 10 is implicitly {automatically) converted to double 10.0
//and stored inside bigNum behind scene
double bigNum =10;
System.out.println(bigNum);

// 12.99 is double , double has much bigger range that int
// so it just does not fit
// int num = 12.99 ; // compiler error!!!

int num = (int) 12.99;
System.out.println(num);

//create a long variable and store int

        long myBigNumber = 554287; // ----> 1554287L
        System.out.println(myBigNumber);
//create an int variable and try to store above long value
        int myBigNumber_ss = (int) myBigNumber;
        System.out.println(myBigNumber_ss);


















    }
}
