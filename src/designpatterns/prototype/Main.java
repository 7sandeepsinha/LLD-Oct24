package designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nikita", "City A, 1234");
        System.out.println(student);
        Student copyStudent = student.copy();
        System.out.println(copyStudent);

        Student batch1Prototype = new Student();
        batch1Prototype.setBatchName("Batch1");
        batch1Prototype.setInstructorName("Sandeep");
        batch1Prototype.setBatchPsp(100);
        batch1Prototype.setBatchAttendance(100);

        Student nayak = batch1Prototype.copy();
        nayak.setId(1);
        nayak.setAdress("Nayak's address");
        nayak.setName("Nayak");

        Student nikita = batch1Prototype.copy();
        nikita.setId(2);
        nikita.setAdress("nikita's address");
        nikita.setName("nikita");

        System.out.println(nayak);
        System.out.println(nikita);


        StudentRegistry registry = new StudentRegistry();
        Student prototype  = registry.getPrototype("BATCH1");

        Student sumit = prototype.copy();
        //then add all details
    }
}
// Registry can be made singleton to make sure,
// that there is only a single registry object