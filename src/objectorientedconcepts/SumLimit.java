package objectorientedconcepts;

public class SumLimit {
    public static void main(String[] args) {
    	
    	SumLimit sl = new SumLimit();
        System.out.println(sl.sumLimit(2, 3)); // Output: 5
        System.out.println(sl.sumLimit(8, 3)); // Output: 8
        System.out.println(sl.sumLimit(8, 1)); // Output: 9
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        int digitCountA = String.valueOf(a).length();
        int digitCountSum = String.valueOf(sum).length();

        if (digitCountSum == digitCountA) {
            return sum;
        } else {
            return a;
        }
    }
}
