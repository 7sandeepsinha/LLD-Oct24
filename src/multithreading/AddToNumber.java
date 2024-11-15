package multithreading;

import java.util.concurrent.Callable;

public class AddToNumber implements Callable<Double> {

    @Override
    public Double call() throws Exception {
        return 5.3 + 10.2;
    }
}
