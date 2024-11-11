import OOP2_AccessModifier_Constructor.Iphone;
import OOP2_AccessModifier_Constructor.Student;

public class OutsideMain {
    public static void main(String[] args) {
        Student student = new Student(1, "Ghanshyam");
        System.out.println("Name : " + student.getName());
        System.out.println("Roll : " + student.getRoll());

        Iphone iphone14 = new Iphone(14, 14, 75000, 6, 6, 12, 2000);
        Iphone iphone15 = new Iphone(iphone14);
        Iphone iphone16 = new Iphone(iphone15);

    }
}
//Main is outside package of Student