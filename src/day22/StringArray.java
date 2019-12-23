package day22;

public class StringArray {
    public static void main(String[] args) {


String [] members = new String [8];
        members[0] = "ilyas";
        members[1] = "narin";
        members[2] = "sevilay";
        members[3] = "serap";
        members[4] = "seda";
        members[5] = "eda";
        members[6] = "mukadder";
        members[7] = "beyza";

        System.out.println(members[0]);
        System.out.println(members[1]);
        System.out.println(members[2]);
        System.out.println(members[3]);
        System.out.println(members[4]);
        System.out.println(members[5]);
        System.out.println(members[6]);
        System.out.println(members[7]);

// immutable means you can not change the internal structure of the object
// if you have String abc = "Hello"
// if you do abc.toUppercase -->> it will create new String object "HELLO"
// and it does not change original hello at all !!
// not resizable --> specifically for array
// we can not change the size of array once we create them with certain size
// However , we can change the elements inside this array
// and it means : IT IS NOT IMMUTABLE



    }
}
