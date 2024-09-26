package objectorientedconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "learning";

        System.out.println("Duplicate characters in the string '" + str + "':");
        printDuplicateCharacters(str);
    }

    public static void printDuplicateCharacters(String str) {
        // Convert the string to lowercase to treat uppercase and lowercase characters as the same
        str = str.toLowerCase();

        // Create a map to store character frequency
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterate through each character in the string and update its frequency in the map
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Consider only letters
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Iterate through the map to print duplicate characters
        Set<Map.Entry<Character, Integer>> entrySet = charFrequencyMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) 
            {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}

