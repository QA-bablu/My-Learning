package objectorientedconcepts;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingLevels {
    private static final Logger logger = Logger.getLogger(LoggingLevels.class.getName());

    public static boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }

        boolean result = innerIndex == inner.length;
        logger.log(Level.INFO, "Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        int[] outer1 = {1, 2, 4, 6};
        int[] inner1 = {2, 4};
        logger.log(Level.INFO, "linearIn([1, 2, 4, 6], [2, 4]) -> " + linearIn(outer1, inner1));  // Output: true

        int[] outer2 = {1, 2, 4, 6};
        int[] inner2 = {2, 3, 4};
        logger.log(Level.INFO, "linearIn([1, 2, 4, 6], [2, 3, 4]) -> " + linearIn(outer2, inner2));  // Output: false

        int[] outer3 = {1, 2, 4, 4, 6};
        int[] inner3 = {2, 4};
        logger.log(Level.INFO, "linearIn([1, 2, 4, 4, 6], [2, 4]) -> " + linearIn(outer3, inner3));  // Output: true
    }
}

