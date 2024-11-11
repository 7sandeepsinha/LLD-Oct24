package OOP4_InterfacesAndAbstractClasses.abstractClassDemo;

public class Tata extends Car {
    @Override
    public void startEngine() {
        System.out.println("Tata engine start");
    }

    @Override
    public void startAc() {
        System.out.println("Tata ac start");
    }
}
