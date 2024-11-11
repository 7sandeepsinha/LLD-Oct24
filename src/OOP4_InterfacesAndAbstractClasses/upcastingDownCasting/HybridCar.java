package OOP4_InterfacesAndAbstractClasses.upcastingDownCasting;

public class HybridCar extends Car{
    @Override
    public void startEngine(){
        System.out.println("Starting hybrid car engine - HYBRID CAR");
    }

    public void startBattery(){
        System.out.println("Start battery");
    }
}
