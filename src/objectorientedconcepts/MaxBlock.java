package objectorientedconcepts;

public class MaxBlock {
    public static void main(String[] args) {
    	
    	MaxBlock mb = new MaxBlock();
    	System.out.println(mb.maxBlock("hoopla"));         // Output: 2
        System.out.println(mb.maxBlock("abbCCCddBBBxx")); // Output: 3
        System.out.println(mb.maxBlock(""));              // Output: 1
    }

    public int maxBlock(String str) {
        int maxCount = 0;
        int currentCount = 1;

        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous character, increment the current count
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentCount++;
            } else {
                // If the current character is different, update the maxCount if the currentCount is greater
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1; // Reset current count
            }
        }

        // Update maxCount after the loop in case the last block is the largest
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }
}
