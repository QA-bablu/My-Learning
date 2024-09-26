package objectorientedconcepts;

import java.util.logging.Logger;

public class LinearInLog {
    private static final Logger LOGGER = Logger.getLogger(LinearInLog.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Testing linearIn method...");
        LOGGER.info("Test Case 1: outer=[1, 2, 4, 6], inner=[2, 4]");
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));       // Output: true
        LOGGER.info("Test Case 2: outer=[1, 2, 4, 6], inner=[2, 3, 4]");
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));    // Output: false
        LOGGER.info("Test Case 3: outer=[1, 2, 4, 4, 6], inner=[2, 4]");
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));    // Output: true
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        LOGGER.info("Checking if all elements of inner array are present in the outer array...");
        int i = 0;
        int j = 0;

        while (i < outer.length && j < inner.length) {
            LOGGER.info(String.format("Comparing outer[%d]=%d with inner[%d]=%d", i, outer[i], j, inner[j]));
            if (outer[i] == inner[j]) {
                LOGGER.info(String.format("Found a match: outer[%d]=%d equals inner[%d]=%d", i, outer[i], j, inner[j]));
                j++; // Move to the next element in the inner array
            }
            i++; // Move to the next element in the outer array
        }

        boolean result = j == inner.length;
        LOGGER.info(String.format("All elements of inner array are present in the outer array: %b", result));
        return result; // If all elements in the inner array are found in the outer array, return true
    }
}

