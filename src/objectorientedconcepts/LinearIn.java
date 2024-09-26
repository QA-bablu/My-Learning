package objectorientedconcepts;

public class LinearIn {
    public static void main(String[] args) {
    	
    	LinearIn li = new LinearIn();
        System.out.println(li.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));       // Output: true
        System.out.println(li.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));    // Output: false
        System.out.println(li.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));    // Output: true
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++; // Move to the next element in the inner array
            }
            i++; // Move to the next element in the outer array
        }

        return j == inner.length; // If all elements in the inner array are found in the outer array, return true
    }
}
