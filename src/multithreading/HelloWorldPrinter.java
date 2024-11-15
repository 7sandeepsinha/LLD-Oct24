package multithreading;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("3. Hello World, thread name : " + Thread.currentThread().getName());
    }
}
