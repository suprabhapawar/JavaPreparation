/*
package streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PairCountExample {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 2, 3, 4, 4, 4, 5};

        // Create pairs of array elements and count their repetitions
        Map<String, Long> pairCounts = Arrays.stream(myArray)
                .boxed()
                .flatMap(i -> Arrays.stream(myArray)
                        .filter(j -> i != j)
                        .map(j -> Stream.of(i, j).sorted().collect(Collectors.toList()))
                )
                .map(pair -> pair.get(0) + "-" + pair.get(1))
                .collect(Collectors.groupingBy(pair -> pair, Collectors.counting()));

        // Display the pairs and their counts
        pairCounts.forEach((pair, count) ->
                System.out.println("Pair: (" + pair + "), Count: " + count)
        );
    }
}*/
