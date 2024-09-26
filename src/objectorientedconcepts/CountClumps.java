package objectorientedconcepts;

public class CountClumps {
    public static void main(String[] args) {
    	
    	CountClumps cc = new CountClumps();
        System.out.println(cc.countClumps(new int[]{1, 2, 2, 3, 4, 4})); // Output: 2
        System.out.println(cc.countClumps(new int[]{1, 1, 2, 1, 1}));     // Output: 2
        System.out.println(cc.countClumps(new int[]{1, 1, 1, 1, 1}));     // Output: 1
    }

    public int countClumps(int[] nums) {
        int clumps = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    inClump = true;
                    clumps++;
                }
            } else {
                inClump = false;
            }
        }

        return clumps;
    }
}
