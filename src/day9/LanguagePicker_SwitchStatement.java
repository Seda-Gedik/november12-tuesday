package day9;

public class LanguagePicker_SwitchStatement {
    public static void main(String[] args ){
        System.out.println(" Welcome to Cybertek Call Center ");
        System.out.println(" Please select your language options from 1-7 ");

        String greeting = "";
        int languageOption = 4 ;

switch (languageOption){
        case 1 :
        greeting = "salam";
        break;
        case 2 :
        greeting = "Hello";
        break;
        case 3 :
        greeting = "Privet";
        break ;
        case 4 :
        greeting = "Hola";
        break;
        case 5:
        greeting = "Merhaba";
        break;
        default:
        greeting = "Unknown ";
    }

        greeting = greeting + " , SDET ";

        System.out.println(" This is how the greeting you get :" + greeting ) ;











    }
}
