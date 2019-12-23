package day25;

public class StringToCharArray {
    public static void main(String[] args) {


// pick up your own name and turn in into char array
// and use for each loop to loop over them
// optionally count how many a you have in your name


        String name = "Seda Yesilyurt Gedik" ;
        // turn this into charArray using toCharArray()method of String
        // toCharArray() is a method of String that turn string into char array
        char [] allCharsInName = name.toCharArray();

        for ( char eachChar : allCharsInName) {
            System.out.println("eachChar = " + eachChar);
        }


        // now count how many e we have
int count = 0;
        for(char eachChar : allCharsInName){
            if (eachChar=='e'){
                ++count;
            }
        }
        System.out.println("count = " + count);










    }



}
