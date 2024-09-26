package objectorientedconcepts;


public class PalindromeWord {

public static void main(String[] args) {
	
	if(isPalindrome("apple"))
	{
		System.out.println("Given string is a Palindrome");
	}
	else
	{
		System.out.println("Given string is not Palindrome");
	}
	
	
}

public static boolean isPalindrome(String originalString)
{
	String reversedString = "";
	
	for(int i=originalString.length()-1;i>=0;i--)
	{
		reversedString = reversedString + originalString.charAt(i);
	}
	return reversedString.equals(originalString);
}

}