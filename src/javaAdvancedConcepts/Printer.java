package javaAdvancedConcepts;

public class Printer implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World : thread : " + Thread.currentThread().getName());
    }
}
