package multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        System.out.println("1. Hello World, thread name : " + Thread.currentThread().getName()); // main
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.run(); // main
        t.start(); // thread 0
        t.start();
        t.run(); // main
        System.out.println("2. Hello World, thread name : " + Thread.currentThread().getName()); // main thread


        for(int i=1;i<=100;i++){
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
        executorService.close();


        ExecutorService executorService = Executors.newFixedThreadPool(2);
        AddToNumber addToNumber = new AddToNumber();
        MultiplyToNumber multiplyToNumber = new MultiplyToNumber();

        Future<Double> addResultFuture = executorService.submit(addToNumber);
        Future<Double> multiplyResultFuture = executorService.submit(multiplyToNumber);

        System.out.println("Calling Get method " + LocalDateTime.now());
        double addResult = addResultFuture.get();
        System.out.println("Add result : " + addResult);
        double multiplyResult = multiplyResultFuture.get();
        System.out.println("Multiply result : " + multiplyResult);
        System.out.println("Got the values " + LocalDateTime.now());
        System.out.println("SUM at main thread : " + addResult + multiplyResult);
        System.out.println("End statement");

         */

        ReentrantLock mutex = new ReentrantLock();

        Count count = new Count();
        Adder adder = new Adder(count, mutex);
        Substractor substractor = new Substractor(count, mutex);

        Thread adderThread = new Thread(adder);
        Thread subsThread = new Thread(substractor);

        adderThread.start();
        subsThread.start();

        adderThread.join(); // completes the thread execution
        subsThread.join();

        System.out.println("COUNT : " + count.val);

    }
}
/*
        Main

        Thread A -> go and add something and give me the result
        Thread B -> go and multiply something and give me the result
 */

/*
    ConcurrentHashMap

 */