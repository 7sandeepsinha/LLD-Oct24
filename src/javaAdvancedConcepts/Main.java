package javaAdvancedConcepts;

public class Main {
    public static void main(String[] args) {
        //GENERICS DEMO
        /*
        Animal animal = new Animal(10);
        //animal.y = 20;
        //Cannot assign a value to final variable 'y'

        ModernCar modernCar = new ModernCar();
        modernCar.demo();
        modernCar.run();

        Pair<Integer, String> idNamePair = new Pair<>();
        idNamePair.setKey(1);
        idNamePair.setValue("Anil");

        //idNamePair.setValue(new Car()); -- not doable as object has types Integer and String


        Pair<Car, Animal> carAnimalPair = new Pair<>();
        // key -- car
        // value -- animal

        List<Integer> list = new ArrayList<>();

         */

        //ANONYMOUS CLASS DEMO
        /*
        Vehicle vehObj = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("Driving");
            }
            @Override
            public void run() {
                System.out.println("Run");
            }
            @Override
            public void brake() {
                System.out.println("Brake");
            }
        };

        vehObj.brake();
        vehObj.drive();
        vehObj.run();

         */

        //LAMBDA FORMATION DEMO
        /*
        // print hello world from a separate thread
        //basic way
        Printer printer = new Printer();
        Thread t = new Thread(printer);
        t.start();

        //anonymous class
        Runnable printerRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world from thread : " + Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(printerRunnable);
        t1.start();

        //shorten the code
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world from thread : " + Thread.currentThread().getName());
            }
        });
        t2.start();

        //shortest code -> lambda implementation
        Thread t3 = new Thread(() ->  {
                System.out.println("Hello world from thread : " + Thread.currentThread().getName());
            }
        );
        t3.start();


        //more shorter code
        Thread t4 = new Thread(() -> System.out.println("Hello world from thread : " + Thread.currentThread().getName()));
        t4.start();

         */

        ///Lambda and Streams demo
        /*
        MathOperation mathOprAddition = (a, b) -> a+b;
        MathOperation mathOprSubtraction = (a, b) -> a-b;

        MathOperation mathOperationModAndPower = (a,b) -> {
            int result = a%b;
            return (int)Math.pow(a, result);
        };

        MathOperation additionOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };

        calculate(10,15, additionOperation);
        calculate(10,15, (a, b) -> a+b);
        calculate(10,15, mathOprAddition);

        calculate(10,15, (a, b) -> a-b);
        calculate(10,15, mathOprSubtraction);

        calculate(10,15, (a,b) -> {
            int result = a%b;
            return (int)Math.pow(a, result);
        });
        calculate(10,15, mathOperationModAndPower);

         */
        try {
            Calculator c = new Calculator();
            c.divide(10,10);
            User u1 = new User(1, "A", 100);
            User u2 = new User(2, "B", 0);
            c.calculateWealth(u1, u2);
            c.calculate(10, 0);
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("something went wrong");
        }
        // main -> calculate -> divide
    }

    public static void calculate(int a, int b, MathOperation mathOperationObj){
        System.out.println("Result = " + mathOperationObj.operate(a,b));
    }
}
// break -> 8 mins -> 10:30 PM