//package collection;
//
//import java.util.HashMap;
//import java.util.Set;
//
//public class DuplicateChar
//{
//    static  void DupliChar(String s){
//        HashMap<Character, Integer> CharCountMap= new HashMap<>();
//        char[] s1= s.toCharArray();
//        for(int i=0; i<s1.length; i++)
//        {
//            if(CharCountMap.containsKey(s1[i]))
//            {
//                CharCountMap.put(s1[i], CharCountMap.get(s1[i]) +1);
//            }
//            else
//            {
//                CharCountMap.put(s1[i],1);
//            }
//        }
//
//        Set<Character> intArray= CharCountMap.keySet();
//        for(Character c:intArray){
//            if(CharCountMap.get(c)>1)
//            {
//                System.out.println("Dupli char is " + c + " and count is " + CharCountMap.get(c));
//            }
//
//        }
//}
//
//    public static void main(String[] args) {
//        String s= "suprabhavaradkar";
//        DupliChar(s);
//    }
//}
package collection;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {
    static void DuplicateChar(String s)
    {
        HashMap<Character,Integer> CharCountMap= new HashMap<>();
        char[] s1=s.toCharArray();
        for(int i=0; i<s1.length; i++)
        {
            if(CharCountMap.containsKey(s1[i]))
            {
                CharCountMap.put(s1[i], CharCountMap.get(s1[i]) +1);
            }
            else
            {
                CharCountMap.put(s1[i], 1);
            }
        }

        System.out.println("count of char is " + CharCountMap);

        Set<Character> intArray= CharCountMap.keySet();
        for(Character c: intArray)
        {
            if(CharCountMap.get(c)>1)
            {
                System.out.println("dupli char is " + c + " and count is " + CharCountMap.get(c));
            }
        }
    }
    public static void main(String[] args) {
        String s= "devanshvaradkar";
        DuplicateChar(s);
    }
}
