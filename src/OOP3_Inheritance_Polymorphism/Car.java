package OOP3_Inheritance_Polymorphism;

public class Car {
    private int id;
    private String name;
    private int noOfWheels;

    public Car(int id, String name, int noOfWheels) {
        this.id = id;
        this.name = name;
        this.noOfWheels = noOfWheels;
    }

    public void startEngine(){
        System.out.println("Starting normal car engine");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
