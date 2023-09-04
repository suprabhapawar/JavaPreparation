package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountArrayItems {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 1, 4, 3, 2, 4, 2, 3, 5, 3, 2, 5, 4, 3};

        // Create a HashMap to store item counts
        Map<Integer, Integer> itemCounts = new HashMap<>();

        // Count the items in the array
        for (int item : array) {
            // If the item is already in the map, increment its count
            if (itemCounts.containsKey(item)) {
                itemCounts.put(item, itemCounts.get(item) + 1);
            } else {
                // If the item is not in the map, add it with a count of 1
                itemCounts.put(item, 1);
            }
        }

        // Print the items and their repetition counts
        for (Map.Entry<Integer, Integer> entry : itemCounts.entrySet()) {
            System.out.println("Item: " + entry.getKey() + " - Count: " + entry.getValue());
        }
    }
}
