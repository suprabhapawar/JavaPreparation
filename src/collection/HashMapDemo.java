package collection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HashMapDemo
{
    //retrieve all values
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();
        map.put(1, "One");
        map.put(2,"Two");
        map.put(3,"Three");

//        Collection<String> values =map.values();
//        for (String value: values)
//        {
//            System.out.println(value);
//        }

        Collection<Integer> keys =map.keySet();
        for (int key: keys)
        {
            System.out.println(key);
        }
    }
}
