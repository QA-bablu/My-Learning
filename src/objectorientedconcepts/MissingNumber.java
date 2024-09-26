package objectorientedconcepts;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = generateArrayWithMissingNumber(100, 45); // Generating array with one missing number

        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);
    }

    // Function to generate an array with a missing number
    public static int[] generateArrayWithMissingNumber(int n, int missingNumber) {
        int[] array = new int[n - 1];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i != missingNumber) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    // Function to find the missing number
    public static int findMissingNumber(int[] array) {
        int expectedSum = 0;
        int actualSum = 0;

        // Calculate the expected sum of numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            expectedSum += i;
        }

        // Calculate the actual sum of the numbers in the array
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}
