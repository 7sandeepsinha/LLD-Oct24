package OOP4_InterfacesAndAbstractClasses.interfaceDemo;

public interface Car {
    public abstract void startEngine();
    void startAc();
}
// Interface only deals with behaviour
// Interfaces only have abstract methods and not attributes
// all methods in an interface are - public || abstract
// so we DONT NEED to write `public abstract`