package OOP3_Inheritance_Polymorphism;

public class ICECar extends Car{
    private String fuelType;

    public ICECar(int id, String name, int noOfWheels, String fuelType) {
        super(id, name, noOfWheels); // super should be the first statement of cons
        this.fuelType = fuelType;
    }

    public void printCarDetails(){
        System.out.println("ID : " + getId());
        System.out.println("Name of car : " + getName());
        System.out.println("NoOfWheels : " + getNoOfWheels());
    }

    public void speed(int speed){
        System.out.println("Burning fuel at speed : " + speed);
    }
}
