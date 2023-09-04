package collection;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {

    static void DupliChar(String s){

        HashMap<Character, Integer> CharCountMap = new HashMap<>();
        char[] s1=s.toCharArray();
        for (int i=0; i<s1.length; i++)
        {
            //System.out.println("test");
          if (CharCountMap.containsKey(s1[i]))
          {
              CharCountMap.put(s1[i],CharCountMap.get(s1[i])+1);
          }

          else
          {
              CharCountMap.put(s1[i], 1) ;
          }
        }
        System.out.println(CharCountMap.toString());

        Set<Character> intArray= CharCountMap.keySet();
//        if(CharCountMap.containsKey(s1[i])>1) {
//            System.out.println("Duplicate characters are" + CharCountMap);
//        }
//        System.out.println(intArray.toString());

        for (Character c: intArray){
//            System.out.println(c);

            if(CharCountMap.get(c)>1)
            {
                System.out.println("Duplicate key is " + c +  " and count is " + CharCountMap.get(c));
            }
        }


    }


    public static void main(String[] args) {
        String s= "devanshvaradkar";
        DupliChar(s);

    }
}
