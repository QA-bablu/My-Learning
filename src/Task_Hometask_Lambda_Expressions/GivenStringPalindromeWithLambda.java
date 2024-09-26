package Task_Hometask_Lambda_Expressions;

import java.util.function.Predicate;

public class GivenStringPalindromeWithLambda {

	public static void main(String[] args) {

		String name = "Ap ple9&";
		GivenStringPalindromeWithLambda gt = new GivenStringPalindromeWithLambda();

		if (gt.isPalindrome(name)) {

			System.out.println("Given String " + name + " is Palindrome");
		} else {
			System.out.println("Given String " + name + " is not Palindrome");
		}
	}

	public boolean isPalindrome(String str) {

		// [^a-zA-Z0-9] it will remove non-alpha numberic characters
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// press left side alt + 94 to type ^ symbol

		System.out.println(cleanedStr);

		Predicate<String> reversedString = s -> new StringBuilder(s).reverse().toString().equals(cleanedStr);
		return reversedString.test(cleanedStr);

	}

	/*
	 * Predicate < String > isPalindrome = str -> { String reversed = new
	 * StringBuilder(str).reverse().toString(); return str.equals(reversed); };
	 * 
	 * // Check if a string is a palindrome using the lambda expression String word1
	 * = "Madam"; boolean isPalindromeResult1 = isPalindrome.test(word1);
	 * System.out.println(word1 + " is a palindrome? " + isPalindromeResult1);
	 * 
	 * String word2 = "radar"; isPalindromeResult1 = isPalindrome.test(word2);
	 * System.out.println(word2 + " is a palindrome? " + isPalindromeResult1);
	 * 
	 * String word3 = "defied"; isPalindromeResult1 = isPalindrome.test(word3);
	 * System.out.println(word3 + " is a palindrome? " + isPalindromeResult1);
	 * 
	 */

}
