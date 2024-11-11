package OOP4_InterfacesAndAbstractClasses.upcastingDownCasting;

public class Main {
    public static void main(String[] args) {
        //upcasting
        Car c = new HybridCar(); // implicit cast
        c.startEngine();
        // c.startBattery(); // compilation error

        //downcasting
        //HybridCar hc = (HybridCar)new Car(); // explicit cast
//        hc.startBattery();
//        hc.startEngine();
    }
}
