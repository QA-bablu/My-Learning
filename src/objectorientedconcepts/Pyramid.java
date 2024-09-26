package objectorientedconcepts;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pyramid");

        int num;
        do {
            System.out.println("\nEnter Number:");
            num = scanner.nextInt();
        } while (num <= 0);

        int x;
        do {
            System.out.println("Enter X:");
            x = scanner.nextInt();
        } while (x <= 0);

        scanner.close();

        System.out.println("\nPyramid using while loop:");
        printPyramidWhile(num, x);

        System.out.println("\nPyramid using do-while loop:");
        printPyramidDoWhile(num, x);

        System.out.println("\nPyramid using for loop:");
        printPyramidFor(num, x);
    }

    // Generate pyramid using while loop
    public static void printPyramidWhile(int num, int x) {
        int i = 0;
        int start = 0;
        while (i < num) {
            int j = 0;
            while (j <= i) {
                System.out.print(start + "\t");
                start=start+x;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Generate pyramid using do-while loop
    public static void printPyramidDoWhile(int num, int x) {
        int i = 0;
        int start = 0;
        do {
            int j = 0;
            do {
                System.out.print(start + "\t");
                start=start+x;
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i < num);
    }

    // Generate pyramid using for loop
    public static void printPyramidFor(int num, int x) {
        int start = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(start + "\t");
                start+=x;
            }
            System.out.println();
        }
    }
}
