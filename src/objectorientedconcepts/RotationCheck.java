package objectorientedconcepts;

public class RotationCheck {
    public static void main(String[] args) {
        String str1 = "helloi";
        String str2 = "lohel";

        if (areRotations(str1, str2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }

    public static boolean areRotations(String str1, String str2) {
        // Check if lengths of two strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of concatenatedStr
        return concatenatedStr.contains(str2);
    }
}
