package multithreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private Semaphore semaProducer;
    private Semaphore semaConsumer;

    public Consumer(Queue<Shirt> store, String name, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

    @Override
    public void run() {
        while (true){
            try{
                semaConsumer.acquire(); // reduce the number of consumers that can enter the store || keys-- -> consumer
                System.out.println("Size of the store : " + store.size() +
                        ", Consumer entering in the store : " + name);
                store.remove();
                semaProducer.release(); // increase the number of producers that can enter the store || key++ -> producer
            } catch (Exception e){
                System.out.println("Exception");
            }
        }
    }
}
