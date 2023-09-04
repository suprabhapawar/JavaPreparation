package findoutput;

public class CheckString {

    public static void main(String[] args) {
        //String str1 = "Java";
        //String str2 = "Java";

        //System.out.println(str1 == str2); //   true  Using == for reference comparison
       // System.out.println(str1.equals(str2));   //  true Using equals() for content comparison

        String s1 = "ONE";

        s1.concat("TWO");

        s1.concat("THREE'S");

        System.out.println(s1);  //ONE

        //only one of them is referenced by the variable s1. The other two objects are created but not used, and they are subject to garbage collection


        //String s1 = "ONE";

        s1 = s1.concat("TWO");

        s1 = s1.concat("THREE'S");

        System.out.println(s1);  //ONETWOTHREE'S

/*        So, a total of three string objects are created in the SCP:

        "ONETWO"
        "ONETWOTHREE'S"
        "THREE'S" (from the string literal)
        Please note that the original string "ONE" remains unchanged in the SCP. In the end, s1 references the string "ONETWOTHREE'S"*/

        System.out.println("ONE" + 2 + 3 + 4 + "FIVE");
        System.out.println(7 + 3 + "Java");
    }
}
