package objectorientedconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            players[i] = new Player(name, score);
        }
        scanner.close();

        // Sort the players array using the Checker comparator
        Arrays.sort(players, new Checker());

        // Print the sorted array
        for (Player player : players) {
            System.out.printf("%s %d\n", player.name, player.score);
        }
    }
}

