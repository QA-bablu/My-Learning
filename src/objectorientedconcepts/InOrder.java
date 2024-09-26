package objectorientedconcepts;

public class InOrder {
    public static void main(String[] args) {
    	
    	InOrder io = new InOrder();
        System.out.println(io.inOrder(1, 2, 4, false)); // Output: true
        System.out.println(io.inOrder(1, 2, 1, false)); // Output: false
        System.out.println(io.inOrder(1, 1, 2, true)); // Output: true
    }

    public  boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }
}

