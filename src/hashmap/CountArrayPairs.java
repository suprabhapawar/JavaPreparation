package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountArrayPairs {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4, 5, 4, 3, 6, 2, 5, 7, 8, 9, 8, 9};

        // Create a HashMap to store pair counts
        Map<Pair, Integer> pairCounts = new HashMap<>();

        // Create pairs and count their occurrences
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                Pair pair = new Pair(array[i], array[j]);

                // If the pair is already in the map, increment its count
                if (pairCounts.containsKey(pair)) {
                    pairCounts.put(pair, pairCounts.get(pair) + 1);
                } else {
                    // If the pair is not in the map, add it with a count of 1
                    pairCounts.put(pair, 1);
                }
            }
        }

        // Print the pairs and their repetition counts
        for (Map.Entry<Pair, Integer> entry : pairCounts.entrySet()) {
            System.out.println("Pair: " + entry.getKey() + " - Count: " + entry.getValue());
        }
    }

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return (first == pair.first && second == pair.second) ||
                    (first == pair.second && second == pair.first);
        }

        @Override
        public int hashCode() {
            return first + second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
