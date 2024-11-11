package OOP3_Inheritance_Polymorphism;

public class ElectricCar extends Car{

    public ElectricCar(int id, String name, int noOfWheels) {
        super(id, name, noOfWheels);
    }

    @Override //just for readability
    public void startEngine(){
        System.out.println("Starting electric car motor");
    }
}
// method signature needs to be same for method overriding
// method signature = name + parameter structure