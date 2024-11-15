package multithreading;

import java.util.concurrent.Callable;

public class MultiplyToNumber implements Callable<Double> {
    @Override
    public Double call() throws Exception {
        Thread.sleep(5000);
        return 2.3 * 5.6;
    }
}
