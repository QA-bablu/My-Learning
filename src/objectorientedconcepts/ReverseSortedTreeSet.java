package objectorientedconcepts;

import java.util.TreeSet;

public class ReverseSortedTreeSet {
    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator for reverse sorting
        TreeSet<Integer> numbers = new TreeSet<>((a, b) -> Integer.compare(b, a));

        // Add numbers to the TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Print the sorted numbers
        System.out.println("Numbers sorted in reverse order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

