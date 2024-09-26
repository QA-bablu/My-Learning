package objectorientedconcepts;

public class SumNumbers {
    public static void main(String[] args) {
    	
    	SumNumbers sn = new SumNumbers();
        System.out.println(sn.sumNumbers("abc123xyz")); // Output: 123
        System.out.println(sn.sumNumbers("aa11b33"));   // Output: 44
        System.out.println(sn.sumNumbers("7 11"));      // Output: 18
    }

    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder numStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr.append(c);
            } else if (numStr.length() > 0) {
                sum += Integer.parseInt(numStr.toString());
                numStr.setLength(0); // Reset numStr
            }
        }

        // Add the last number if the string ends with a number
        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        return sum;
    }
}

