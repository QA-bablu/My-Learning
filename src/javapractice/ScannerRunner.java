package javapractice;

import java.util.Scanner;

public class ScannerRunner {

	public static void main(String[] args) {
		
		boolean isRepeat = true;
		
		while(isRepeat) {

		System.out.println("Please enter, number of menu:");
		System.out.println("1 - Sum");
		System.out.println("2 - Factorial");
		System.out.println("0 - Exit");

		Scanner scanner = new Scanner(System.in);
		int action = scanner.nextInt();

		switch (action) {

		case 0:
			isRepeat = true;
			System.out.println("Completed");
			break;
		case 1:
			int toValueSum;
			System.out.println("Please, enter :N");
			toValueSum = scanner.nextInt();
			ScannerClass t = new ScannerClass(toValueSum);
			System.out.println("Sum = " + t.sum());
			break;
		case 2:
			int toFactorial;
			System.out.println("Please, enter :N");
			toFactorial = scanner.nextInt();
			ScannerClass t1 = new ScannerClass(toFactorial);
			System.out.println("Factorial = " + t1.factorial());
			break;
		default:
			System.out.println("Incorrect value, Please try again");

		}

	}
	}
}
