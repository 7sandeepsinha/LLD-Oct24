package OOP4_InterfacesAndAbstractClasses.abstractClassDemo;

public abstract class Car {
    private int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public abstract void startEngine();
    public abstract void startAc();
    //access modifiers are needed
    //abstract keyword are needed

    public void blowHorn(){
        System.out.println("CAR HORN");
    }
}
