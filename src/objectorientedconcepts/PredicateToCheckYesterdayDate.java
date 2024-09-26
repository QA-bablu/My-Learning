package objectorientedconcepts;

import java.time.LocalDate;

public class PredicateToCheckYesterdayDate {

    public static boolean isYesterdayDate(LocalDate givenDate) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Calculate yesterday's date
        LocalDate yesterday = today.minusDays(1);
        
        // Compare givenDate with yesterday's date
        return givenDate.equals(yesterday);
    }

    public static void main(String[] args) {
        // Example usage
        LocalDate givenDate1 = LocalDate.of(2024, 6, 15); // June 15, 2024
        System.out.println(isYesterdayDate(givenDate1)); // Output: true
        
        LocalDate givenDate2 = LocalDate.of(2024, 6, 14); // June 14, 2024
        System.out.println(isYesterdayDate(givenDate2)); // Output: false
        
        LocalDate givenDate3 = LocalDate.of(2024, 6, 16); // June 16, 2024
        System.out.println(isYesterdayDate(givenDate3)); // Output: false
    }
}
