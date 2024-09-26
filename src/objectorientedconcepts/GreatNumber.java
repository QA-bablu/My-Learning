package objectorientedconcepts;

public class GreatNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        
        GreatNumber gn = new GreatNumber();
        boolean result = gn.isGreatNumber(a, b);
        System.out.println("Result: " + result);
    }

    public boolean isGreatNumber(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }
}

