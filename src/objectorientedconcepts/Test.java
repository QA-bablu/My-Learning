package objectorientedconcepts;

public class Test {

	public static void main(String[] args) {

		int num = 1218;

		if (isPalindrome(num)) {

			System.out.println("Given String " + num + " is Palindrome");
		} else {
			System.out.println("Given String " + num + " is not Palindrome");
		}
	}

	private static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reversedNumber = 0;

		while (num > 0) {

			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;

			num /= 10;

		}

		return reversedNumber == originalNumber;
	}

}