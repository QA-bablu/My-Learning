package objectorientedconcepts;

import java.util.function.Predicate;

public class PalindromeLamda {
    public static boolean isPalindrome(String str) {
        // Removing non-alphanumeric characters and converting to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Using lambda expression to check for palindrome
        Predicate<String> palindromeCheck = s -> new StringBuilder(s).reverse().toString().equals(s);
        
        return palindromeCheck.test(cleanedStr);
    }

    public static void main(String[] args) {
        String str = "Apple";
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str));
    }
}

