package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        // YOU DO THIS
        // from 1-100  print out all the numbers can be divided by 15 without remainder
        // DO THIS ONE TOGETHER
        // from 1-100  count how many numbers can be divided by 15





    int counter = 0;


    for ( int num = 1; num <=100; num++) {

        if (num % 15 == 0) {
            System.out.println(num);
            //counter = counter +1
            //counter +=1
            ++counter;
        }

    }
        System.out.println("counter = " + counter );



String name = "Esra Fidan Seda Yesilyurt Gedik ";
        //System.out.println( name.charAt(0) == 'a');
        int countOfA = 0;

        for (int index = 0;  index < name.length()  ; index++) {

            System.out.println(name.charAt(index)  );
            if (name.charAt(index) == 'a' ){
                System.out.println("Bingo found it!! ");
              ++countOfA ;
            }
        }

        System.out.println("countOfA = " + countOfA);






    }
}
