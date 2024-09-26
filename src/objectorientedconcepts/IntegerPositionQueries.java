package objectorientedconcepts;

import java.util.Scanner;

public class IntegerPositionQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of lines
        scanner.nextLine(); // Consume newline

        // Array to store the lines
        String[][] lines = new String[n][];

        // Read and store each line
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); // Read the current line
            lines[i] = line.split(" "); // Split the line by space to get individual integers
        }

        int q = scanner.nextInt(); // Number of queries
        scanner.nextLine(); // Consume newline

        // Process each query
        for (int i = 0; i < q; i++) {
            int lineNum = scanner.nextInt(); // Line number for the query
            int position = scanner.nextInt(); // Position for the query

            // Check if the line number is valid
            if (lineNum >= 1 && lineNum <= n) {
                String[] line = lines[lineNum - 1]; // Get the line
                // Check if the position is valid
                if (position >= 1 && position <= line.length) {
                    int number = Integer.parseInt(line[position - 1]); // Get the number at the specified position
                    System.out.println(number);
                } else {
                    // If position is invalid
                    System.out.println("Invalid position");
                }
            } else {
                // If line number is invalid
                System.out.println("Invalid line number");
            }
        }

        scanner.close();
    }
}
