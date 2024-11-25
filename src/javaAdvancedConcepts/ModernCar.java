package javaAdvancedConcepts;

public class ModernCar extends Car {
    private int enginePower;

    @Override
    public void run(){
        System.out.println("Engine power : " + super.enginePower);
        super.run(); // call the run method from parent class
        System.out.println("Step5");
        System.out.println("Step6");
    }

    public void demo(){
        super.run(); // runs the run() method from parent class of current object -> Car
        this.run(); // runs the run() method from current object -> ModernCar
        run(); // run() == this.run()
    }
}
