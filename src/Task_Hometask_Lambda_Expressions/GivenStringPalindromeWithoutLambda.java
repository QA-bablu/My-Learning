package Task_Hometask_Lambda_Expressions;

public class GivenStringPalindromeWithoutLambda {

	public static void main(String[] args) {

		String name = "bablu";

		GivenStringPalindromeWithoutLambda g = new GivenStringPalindromeWithoutLambda();

		if (g.isPalindrome(name)) {

			System.out.println("Given String " + name + " is Palindrome");

		} else {

			System.out.println("Given String " + name + " is not Palindrome");
		}

	}

	public boolean isPalindrome(String name) {

		String reversString = "";
		String originalString = name;
		char[] arr = name.toCharArray();
		for (int i = arr.length - 1; i > 0; i--)

		{
			reversString = reversString + arr[i];

		}

		return reversString == originalString;
	}

}
