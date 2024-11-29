package javaAdvancedConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {

    public int divide(Integer a, Integer b){ //
        System.out.println("We are going to do division");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        try {
            System.out.println("before division");
            int result = a/b;
            System.out.println("after division");
            return result;
        }
        //catch (Exception ex){} // always place the most generic exception in the lowest order. Specific to Generic exceptions - top to bottom
        catch (ArithmeticException ex) { // matching with exceptions in catch block is sequential
            ex.printStackTrace();
            System.out.println("Dividing a number by zero ");
        } catch (NullPointerException ex){
            System.out.println("One of the numbers were null");
        } finally {
            // always executes || use it for cleaning up occupied resources
            executorService.close();
            System.out.println("Hello from finally");
        }
        System.out.println("Before function ends after catch");
        return 0;
    }

    public int divide2(Integer a, Integer b) throws ArithmeticException, NullPointerException, Exception { //
        System.out.println("Before division");
        int result = a/b;
        System.out.println("After division");
        return a/b;
    }

    public void add(Integer a, Integer b){
        System.out.println(a+b);
    }

    public void calculate(Integer a, Integer b) throws ArithmeticException, NullPointerException, Exception{
        System.out.println("Calculating something");
        int result = divide2(a, b); // Unhandled exception: java.lang.Exception
        System.out.println(result);
    }

    public void calculateWealth(User u1, User u2) throws Exception{
        try {
            int result = u1.getMoney() / u2.getMoney();
            System.out.println("Result " + result);
        } catch (ArithmeticException ax) {
            System.out.println("User details : " + u2.toString());
            throw new ArithmeticException(ax.getMessage()); // throw -> throw an exception at any place
        }
    }
}
// try -> catch -> finally -- handling at the same level


// put the code that might throw exception inside try
// handle the exceptions in catch block


// break -> 10:32 PM