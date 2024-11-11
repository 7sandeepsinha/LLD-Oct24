package OOP2_AccessModifier_Constructor;

public class Iphone {
    private int version;
    private int processorVersion;
    private int price;
    private int screenSize;
    private int ram;
    private int cameraMP;
    private int batteryCapacity;

    //default
    public Iphone(){

    }

    public Iphone(int version, int processorVersion){
        this.version = version;
        this.processorVersion = processorVersion;
    }

    //parameterised
    public Iphone(int version, int processorVersion, int price, int screenSize, int ram, int cameraMP, int batteryCapacity) {
        this.version = version;
        this.processorVersion = processorVersion;
        this.price = price;
        this.screenSize = screenSize;
        this.ram = ram;
        this.cameraMP = cameraMP;
        this.batteryCapacity = batteryCapacity;
    }

    //copy
    public Iphone(Iphone iphone){
        version = iphone.version + 1;
        price = iphone.price + 5000;
        processorVersion = iphone.processorVersion;
        screenSize = iphone.screenSize;
        ram = iphone.ram;
        cameraMP = iphone.cameraMP;
        batteryCapacity = iphone.batteryCapacity;
    }

    // Constructor Overloading
}
