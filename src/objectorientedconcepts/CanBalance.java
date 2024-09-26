package objectorientedconcepts;

public class CanBalance {
    public static void main(String[] args) {
    	
    	CanBalance cb = new CanBalance();
        System.out.println(cb.canBalance(new int[]{1, 1, 1, 2, 1})); // Output: true
        System.out.println(cb.canBalance(new int[]{2, 1, 1, 2, 1})); // Output: false
        System.out.println(cb.canBalance(new int[]{10, 10}));         // Output: true
    }

    public boolean canBalance(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array and check if the left sum equals the right sum
        for (int num : nums) {
            leftSum += num;
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }

        return false;
    }
}

