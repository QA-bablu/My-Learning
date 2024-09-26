package objectorientedconcepts;

public class MaxSpan {
    public static void main(String[] args) {
    	
    	MaxSpan ms = new MaxSpan();
        System.out.println(ms.maxSpan(new int[]{1, 2, 1, 1, 3}));         // Output: 4
        System.out.println(ms.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));   // Output: 6
        System.out.println(ms.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));   // Output: 6
    }

    public int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int span = 0;
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] == nums[i]) {
                    span = j - i + 1;
                    break;
                }
            }
            maxSpan = Math.max(maxSpan, span);
        }

        return maxSpan;
    }
}

