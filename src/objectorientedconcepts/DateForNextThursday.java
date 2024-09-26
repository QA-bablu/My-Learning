package objectorientedconcepts;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class DateForNextThursday {

    public static void main(String[] args) {
        // Create a supplier for next Thursday
        Supplier<LocalDate> nextThursdaySupplier = () -> {
            LocalDate today = LocalDate.now();
            return today.with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        };

        // Get and print next Thursday's date
        LocalDate nextThursday = nextThursdaySupplier.get();
        System.out.println("Next Thursday's date: " + nextThursday);
    }
}

