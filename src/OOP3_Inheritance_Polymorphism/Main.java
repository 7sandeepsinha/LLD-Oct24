package OOP3_Inheritance_Polymorphism;

public class Main {
    public static void main(String[] args) {
        ICECar iceCar = new ICECar(1, "BMW", 4, "Petrol");
        iceCar.speed(10);

        System.out.println("Hello World");
        System.out.println(1);
        System.out.println(true);
        System.out.println('A');
        System.out.println(11.12);

        Calculator calculator = new Calculator();
        calculator.add(10, 12);
        calculator.add(10.1, 12.3);
        calculator.add(10, 12.3);

        ElectricCar electricCar = new ElectricCar(2, "BMW iX", 4);
        electricCar.startEngine();

        Car car = new Car(3, "Tata", 4);
        car.startEngine();
    }
}

