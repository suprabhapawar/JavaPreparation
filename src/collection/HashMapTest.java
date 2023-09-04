package collection;

import java.util.HashMap;
import java.util.Map;
import  java.util.Set;
import  java.util.Map.Entry;

public interface HashMapTest {
    //printing hashmap/map key-value pairs
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

      Set<Entry<String, Integer>> entrySet = map.entrySet();
      for (Entry<String, Integer> entry:entrySet){
          System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
      }
//or
      for (Map.Entry<String, Integer> itr : map.entrySet())
      {
          String key= itr.getKey();
          int value= itr.getValue();

          System.out.println("key: " +key +" value:" +value);
      }
    }
}
