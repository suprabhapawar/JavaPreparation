package collection;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer>map= new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("Indonesia", 34);
        map.put("China", 678);

        System.out.println(map);

        map.put("China", 890);
        System.out.println(map);

        //search
        if (map.containsKey("US"))
        {
            System.out.println("Key is present in the map");
        }
        else
        {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("US")); //key doesn't exists

        int arr[]={12,15,18};
        for(int i=0; i<=2; i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();

        for(int val:arr)
        {
            System.out.println(val+ " ");
        }
        System.out.println();

    }
}
