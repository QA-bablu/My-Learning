package objectorientedconcepts;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Supplier;

public class CurrentTimeInESTtimezone {

    public static void main(String[] args) {
        // Create a supplier for current time in EST timezone
        Supplier<LocalTime> currentTimeESTSupplier = () -> {
            return LocalTime.now(ZoneId.of("America/New_York"));
        };

        // Get and print current time in EST
        LocalTime currentTimeEST = currentTimeESTSupplier.get();
        System.out.println("Current time in EST: " + currentTimeEST);
    }
}

