package multithreading.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private Semaphore semaProducer;
    private Semaphore semaConsumer;

    public Producer(Queue<Shirt> store, String name, Semaphore semaProducer, Semaphore semaConsumer) {
        this.store = store;
        this.name = name;
        this.semaProducer = semaProducer;
        this.semaConsumer = semaConsumer;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaProducer.acquire(); // reduce the number of producers that can enter the store || key-- -> producer
                System.out.println("Size of the store : " + store.size() +
                        ", Producer entering in the store : " + name);
                store.add(new Shirt()); // 5
                semaConsumer.release(); // increase the number of consumers that can enter the store || key++ -> consumer
            }catch (Exception e){
                System.out.println("Exception");
            }
        }
    }
}
