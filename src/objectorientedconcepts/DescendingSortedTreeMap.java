package objectorientedconcepts;

import java.util.Comparator;
import java.util.TreeMap;

public class DescendingSortedTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator for descending sorting
        TreeMap<Integer, String> values = new TreeMap<>(Comparator.reverseOrder());

        // Add values to the TreeMap
        values.put(1, "One");
        values.put(2, "Two");
        values.put(3, "Three");
        values.put(4, "Four");
        values.put(5, "Five");

        // Print the sorted values
        System.out.println("Values sorted in descending order:");
        values.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
