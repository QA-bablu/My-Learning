package objectorientedconcepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondBiggestNumberWithLamda {
    public static int findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("List should have at least two distinct elements"));
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 10, 25);
        System.out.println("Second largest number: " + findSecondLargest(numbers));
    }
}
