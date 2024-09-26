package objectorientedconcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondBiggestNumberWithoutLamda {
    public static int findSecondLargest(List<Integer> numbers) {
        // If the list has less than two elements, throw an exception
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("List should have at least two elements");
        }

        // Sort the list in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // The second largest number is at index 1
        return numbers.get(1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 10, 25);
        System.out.println("Second largest number: " + findSecondLargest(numbers));
    }
}

