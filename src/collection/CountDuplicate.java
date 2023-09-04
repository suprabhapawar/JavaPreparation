package collection;

import java.util.HashMap;

public class CountDuplicate {
    static void CharCount(String s2)
    {
//        System.out.println("hello " + s2);
        HashMap<Character, Integer> CountMap= new HashMap<Character, Integer>();
        char c[]=s2.toCharArray();
        for(char c1=0; c1< c.length; c1++)
        {
            if(CountMap.containsKey(c[c1]))
            {
                System.out.println();
            }
        CountMap.put(c[c1],1);
            System.out.println(c[c1]);
        }
        System.out.println(CountMap.toString());
    }
    public static void main(String[] args) {
//    CountDuplicate c =new CountDuplicate();
        String s1="Suprabhapawar";
        CharCount(s1);

    }
}
