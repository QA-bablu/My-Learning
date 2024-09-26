package objectorientedconcepts;

public class NumberPrinter implements Runnable {
    private final int start;
    private final int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Creating a new instance of NumberPrinter
        NumberPrinter numberPrinter = new NumberPrinter(1, 10);

        // Creating a new thread and starting it
        Thread thread = new Thread(numberPrinter);
        thread.start();
    }
}

