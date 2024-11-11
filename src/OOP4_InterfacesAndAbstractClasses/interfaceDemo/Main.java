package OOP4_InterfacesAndAbstractClasses.interfaceDemo;

import OOP4_InterfacesAndAbstractClasses.upcastingDownCasting.Student;

public class Main {
    public static void main(String[] args) {
        travel(new RollsRoyce());
        travel(new BMW());
        travel(new Tata());

        Student.morningPrayer(); // static call
        Student student = new Student();
        student.study();
        student.morningPrayer(); // static call
        // for static methods we dont need an object
        // we can use className or object to call/use static methods and attributes
    }

    public static void travel(Car car){
        car.startEngine();
        car.startAc();
    }

    public static void makeASale(PaymentGateway paymentGateway){
        paymentGateway.doTransaction();
    }
}
