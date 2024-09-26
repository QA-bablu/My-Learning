package objectorientedconcepts;

public class NumberPrinterWithLambda {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        // Creating a new thread using a lambda expression
        Thread thread = new Thread(() -> {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        });

        // Starting the thread
        thread.start();
    }
}

