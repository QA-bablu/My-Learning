package objectorientedconcepts;

public class PartyOutcome {
    public static void main(String[] args) {
        int tea = 5;
        int candy = 10;
        
        PartyOutcome po = new PartyOutcome();
        int outcome = po.partyOutcome(tea, candy);
        System.out.println("Outcome: " + outcome);
    }

    public int partyOutcome(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0; // Bad party if either tea or candy is less than 5
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2; // Great party if either tea or candy is at least double the amount of the other one
        } else {
            return 1; // Good party if both tea and candy are at least 5
        }
    }
}
