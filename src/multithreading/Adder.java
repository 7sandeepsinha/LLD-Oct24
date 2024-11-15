package multithreading;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            count.val = count.val + 1;
        }
    }
}
