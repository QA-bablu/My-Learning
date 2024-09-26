package objectorientedconcepts;

public class CommonDigit {
    public static void main(String[] args) {
    	
    	CommonDigit cd = new CommonDigit();
        System.out.println(cd.hasCommonDigit(12, 23)); // Output: true
        System.out.println(cd.hasCommonDigit(12, 43)); // Output: false
        System.out.println(cd.hasCommonDigit(12, 44)); // Output: true
    }

    public boolean hasCommonDigit(int a, int b) {
        int leftDigitA = a / 10;
        int rightDigitA = a % 10;
        int leftDigitB = b / 10;
        int rightDigitB = b % 10;

        return leftDigitA == leftDigitB || leftDigitA == rightDigitB ||
               rightDigitA == leftDigitB || rightDigitA == rightDigitB;
    }
}
