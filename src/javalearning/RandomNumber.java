package javalearning;

import java.util.Random;
import java.util.function.IntSupplier;

class RandomNumber {
    public static void main(String[] args) {
        IntSupplier randomBelow5000 = () -> new Random().nextInt(5000);

        int randomNum = randomBelow5000.getAsInt();
        System.out.println("Random number below 5000: " + randomNum);
    }
}

