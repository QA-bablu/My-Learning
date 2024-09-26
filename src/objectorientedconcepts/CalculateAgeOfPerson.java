package objectorientedconcepts;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeOfPerson {

    public static int calculateAge(LocalDate birthDate) {
        // Calculate the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birth date and current date
        Period period = Period.between(birthDate, currentDate);

        // Return the age
        return period.getYears();
    }

    public static void main(String[] args) {
        // Example usage:
        LocalDate birthDate = LocalDate.of(1990, 5, 15); // Example birth date (May 15, 1990)
        int age = calculateAge(birthDate);
        System.out.println("Age: " + age); // Output: Age: 34 (depending on current date)
    }
}
