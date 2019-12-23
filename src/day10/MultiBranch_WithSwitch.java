package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {

        System.out.println(" Welcome to McDonald , what can I get for you ");
        String order = "" ;
        int itemNumber = 35 ;
        // what data type of variable I can use here
        // byte, short, int, char, String

        switch (itemNumber){
            case 11 :
                System.out.println(" You have selected 11");
                order = "Burger";
                break;
            case 5 :
                System.out.println(" You have selected 5 ");
                order = "French Fry";
                break;
            case 35 :
                System.out.println(" You have selected 35 ");
                System.out.println(" YAYYY!!");
                System.out.println(" Enjoy!!");
                order = "Ice Cream";
                break;
            case 8 :
                System.out.println(" You have selected 8 ");
                order = "Nuggets";
                break;
            default :
                System.out.println(" You have selected unknown item number ");
                order = " Unknown ";
                break;

        }
        System.out.println(" You order is " + order);















    }
}
