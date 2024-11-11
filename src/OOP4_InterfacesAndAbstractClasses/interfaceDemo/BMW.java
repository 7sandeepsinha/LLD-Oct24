package OOP4_InterfacesAndAbstractClasses.interfaceDemo;

public class BMW implements Car{
    private int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    @Override
    public void startEngine() {
        System.out.println("BMW engine start");
    }

    @Override
    public void startAc() {
        System.out.println("BMW AC start");
    }

    public void beemerLights(){
        System.out.println("BMW lights on");
    }

    public void blowHorn(){
        System.out.println("CAR HORN");
    }
}

/* behaviour was also same
 inheritance
blowHorn(){
    sout(Pow pow);
}
 */