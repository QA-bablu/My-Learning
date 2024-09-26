package objectorientedconcepts;

public class SpeedingTicket {
    public static void main(String[] args) {
        int speed = 85; // Speed of the car
        boolean isBirthday = false; // Change to true if it's the driver's birthday

        
        SpeedingTicket st = new SpeedingTicket();
        int result = st.caughtSpeeding(speed, isBirthday);
        System.out.println("Ticket Result: " + result);
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        // Adjust speed limit if it's the driver's birthday
        if (isBirthday) {
            speed -= 5;
        }

        // Check the speed and return the corresponding ticket result
        if (speed <= 60) {
            return 0;
        } else if (speed >= 61 && speed <= 80) {
            return 1;
        } else {
            return 2;
        }
 }}

