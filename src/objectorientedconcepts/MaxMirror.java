package objectorientedconcepts;

public class MaxMirror {
    public static void main(String[] args) {
    	
    	MaxMirror mm = new MaxMirror();
        System.out.println(mm.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1})); // Output: 3
        System.out.println(mm.maxMirror(new int[]{1, 2, 1, 4}));               // Output: 3
        System.out.println(mm.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));      // Output: 2
    }

    public int maxMirror(int[] nums) {
        int maxMirrorLength = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int index1 = i;
                int index2 = j;

                // Count the number of elements in the mirror section
                while (index1 < nums.length && index2 >= 0 && nums[index1] == nums[index2]) {
                    count++;
                    index1++;
                    index2--;
                }

                maxMirrorLength = Math.max(maxMirrorLength, count);
            }
        }

        return maxMirrorLength;
    }
}

