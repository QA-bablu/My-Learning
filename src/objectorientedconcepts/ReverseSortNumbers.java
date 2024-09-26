package objectorientedconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseSortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Sorting the list in reverse order using Comparator.reverseOrder()
        Collections.sort(numbers, Comparator.reverseOrder());

        // Printing the sorted list
        System.out.println("Numbers sorted in reverse order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

