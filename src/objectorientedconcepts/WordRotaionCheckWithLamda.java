package objectorientedconcepts;

import java.util.function.Predicate;

public class WordRotaionCheckWithLamda {
    public static boolean areRotations(String str1, String str2) {
        // Using a lambda expression to check if one string is a rotation of the other
        Predicate<String> rotationCheck = s -> (s + s).contains(str2);

        // Check if str2 is a rotation of str1 or vice versa
        return rotationCheck.test(str1) || rotationCheck.test(str2);
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        
        if (areRotations(str1, str2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are rotations of each other.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not rotations of each other.");
        }
    }
}
