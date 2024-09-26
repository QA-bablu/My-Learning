package objectorientedconcepts;

import java.util.*;

public class TreeMapDescendingOrderWithLambda {
    public static void main(String[] args) {
        // Creating a sample set of values
        Set<Integer> values = new HashSet<>(Arrays.asList(5, 3, 9, 2, 7));

        // Creating a TreeMap and sorting in descending order using lambda expression
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(
                (key1, key2) -> key2.compareTo(key1)
        );

        // Adding values to TreeMap
        for (Integer value : values) {
            treeMap.put(value, value);
        }

        // Printing TreeMap
        System.out.println("TreeMap sorted in descending order:");
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

