package javalearning;

import java.util.function.IntPredicate;

class PredicatePrimeNumber {
    public static void main(String[] args) {
        IntPredicate isPrime = PredicatePrimeNumber::isPrimeNumber;

        int number = 17; // Example number to check
        if (isPrime.test(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

