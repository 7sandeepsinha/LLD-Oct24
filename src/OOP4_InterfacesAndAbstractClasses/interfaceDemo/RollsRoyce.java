package OOP4_InterfacesAndAbstractClasses.interfaceDemo;

public class RollsRoyce implements Car{
    private int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public void startEngine() {
        System.out.println("Rolls Royce engine start");
    }

    @Override
    public void startAc() {
        System.out.println("Rolls Royce AC start");
    }

    public void blowHorn(){
        System.out.println("CAR HORN");
    }
}

//Class 'RollsRoyce' must either be declared abstract
// or implement abstract method 'startEngine()' in 'Car'