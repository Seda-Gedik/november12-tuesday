package day29;

import java.util.Arrays;

public class FillingUpStringArray {
    public static void main(String[] args) {

String [] strArr = new String [300];
        System.out.println("before filling strArr = " + Arrays.toString(strArr) );
        // strArr[0] = " I Love Java";
        // strArr[1] = " I Love Java";
        // strArr[2] = " I Love Java";

        // strArr[0] = " 1.I Love Java";
        // strArr[1] = " 2.I Love Java";
        // strArr[2] = " 3.I Love Java";

                             // 300
        for (int i = 0; i < strArr.length ; i++) {
            strArr[i] = (i+1) + ".I Love Java";
           // strArr[i] =  "I Love Java";
        }
        System.out.println("strArr = " + Arrays.toString(strArr) );

        String str = new String("ABC");
        String [] strArr2 = new String [5];



    }
}
