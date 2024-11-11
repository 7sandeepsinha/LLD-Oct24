package OOP4_InterfacesAndAbstractClasses.abstractClassDemo;

public class RollsRoyce extends Car {
    @Override
    public void startEngine() {
        System.out.println("Rolls Royce engine start");
    }

    @Override
    public void startAc() {
        System.out.println("Rolls Royce AC start");
    }
}

//Class 'RollsRoyce' must either be declared abstract
// or implement abstract method 'startEngine()' in 'Car'