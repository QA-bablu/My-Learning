package javalearning;

import java.util.function.IntConsumer;

class Sqare {
    public static void main(String[] args) {
        IntConsumer printSquare = num -> System.out.println("Square of " + num + " is " + (num * num));

        int number = 5; // Example number
        printSquare.accept(number);
    }
}

