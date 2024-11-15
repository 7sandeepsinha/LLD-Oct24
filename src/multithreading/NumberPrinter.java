package multithreading;

public class NumberPrinter implements Runnable {
    private int x;

    public NumberPrinter(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println("Number : " + x + ", thread name : " + Thread.currentThread().getName());
    }
}
