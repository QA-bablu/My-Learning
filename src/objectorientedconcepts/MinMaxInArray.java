package objectorientedconcepts;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {6,10, 5, 15, 3, 128, 2, 7, }; // Example array

        int smallest = findSmallestNumber(numbers);
        int largest = findLargestNumber(numbers);

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    // Function to find the smallest number in the array
    public static int findSmallestNumber(int[] array) {
        /*if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }*/

        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    // Function to find the largest number in the array
    public static int findLargestNumber(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}
