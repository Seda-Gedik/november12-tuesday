package day7;

public class incrementAndDecrement {
  public static void main(String[] args) {

   int apple = 10;
   System.out.println("original apple is " + apple);
  // apple = apple +1 ;
  // apple +=1 ;
     ++ apple ; // this is increasing the value by one in shortcut using ++
     ++ apple ; // bu birkez daha yazarsan +1 artiriyor
   // bunlarin hepsi ayni islemi gerceklestiriyor 1 ekliyor
      System.out.println("used ++ twice then apple is " +apple);

   // apple = apple -1 ;
   // apple -= 1 ;
   -- apple ;
   System.out.println("used -- once then apple is " +apple);

   //System.out.println( ++apple );

   System.out.println("used ++ to increment and concatenate : " +   (++apple)   );

   















  }

}
