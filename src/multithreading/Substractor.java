package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Substractor implements Runnable{
    private Count count;
    private ReentrantLock mutex;

    public Substractor(Count count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    //mutex
    /*
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            mutex.lock();
            count.val = count.val - 1;
            mutex.unlock();
        }
    }
     */

    //synchronised method
    /*
    @Override
    public synchronized void run() {
        for(int i=0;i<100;i++){
            count.val = count.val - 1;
        }
    }
     */

    //synchronised block
    /*
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            synchronized (Count.class) { // lock
                count.val = count.val - 1;
            }// unlock
        }
    }

     */

    public void run(){
        for(int i=0;i<100;i++) {
            count.integer.getAndDecrement();
        }
    }
}
