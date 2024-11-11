package OOP4_InterfacesAndAbstractClasses.interfaceDemo;

public class Tata implements Car{
    private int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public void startEngine() {
        System.out.println("Tata engine start");
    }

    @Override
    public void startAc() {
        System.out.println("Tata ac start");
    }

    public void blowHorn(){
        System.out.println("CAR HORN");
    }
}
