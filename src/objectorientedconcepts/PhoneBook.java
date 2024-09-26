package objectorientedconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the number of entries in the phone book
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		// Create a HashMap to store phone book entries
		Map<String, String> phoneBook = new HashMap<>();

		// Read and store phone book entries
		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine().trim(); // Read the name
			String phoneNumber = scanner.nextLine().trim(); // Read the phone number
			phoneBook.put(name, phoneNumber); // Store the entry in the phone book
		}

		// Read and process queries until end-of-file
		while (scanner.hasNext()) {
			String query = scanner.nextLine().trim(); // Read the query
			if (phoneBook.containsKey(query)) {
				// If the query matches a name in the phone book, print the corresponding phone
				// number
				System.out.println(query + "=" + phoneBook.get(query));
			} else {
				// If the query does not match any name in the phone book, print "Not found"
				System.out.println("Not found");
			}
		}

		scanner.close();
	}

}
