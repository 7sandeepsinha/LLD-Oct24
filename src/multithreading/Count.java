package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    public int val = 0;
    public AtomicInteger integer;

    public Count() {
        integer = new AtomicInteger(0);
    }
}
