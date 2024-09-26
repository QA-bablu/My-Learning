package objectorientedconcepts;

public class BlueLotteryTicket {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = 5;
        
        BlueLotteryTicket bt = new BlueLotteryTicket();
        int result = bt.lotteryTicketOutcome(a, b, c);
        System.out.println("Result: " + result);
    }

    public int lotteryTicketOutcome(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10; // If any pair sums to exactly 10
        } else if (ab - bc == 10 || ab - ac == 10) {
            return 5; // If the ab sum is exactly 10 more than either bc or ac sums
        } else {
            return 0; // Otherwise, the result is 0
        }
    }
}

