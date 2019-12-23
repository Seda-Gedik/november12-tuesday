package day10;

public class Calculator_V2 {
    public static void main(String[] args) {

int num1 = 12;
int num2 = 25;
char operator = '*';
switch (operator){

    case '+' :
        System.out.println( num1 + num2 );
        break;
    case '-' :
        System.out.println( num1 - num2 );
        break;
    case '*' :
        System.out.println( num1 * num2 );
        break;
    case '/' :
        System.out.println( num1 / num2 );
        break;
    default:
        System.out.println(" Invalied Operator ");

}







    }
}
