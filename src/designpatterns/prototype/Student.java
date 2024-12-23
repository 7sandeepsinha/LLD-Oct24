package designpatterns.prototype;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private String adress;
    private String batchName;
    private String instructorName;
    private double batchPsp;
    private double batchAttendance;

    public Student() {
    }

    public Student(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public Student copy() { //
        Student copy = new Student();
        copy.id = this.id; // this keyword represents the object that called this method
        copy.adress = this.adress;
        copy.name = this.name;
        copy.batchName = this.batchName;
        copy.batchAttendance = this.batchAttendance;
        copy.batchPsp  = this.batchPsp;
        copy.instructorName = this.instructorName;
        return copy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", batchName='" + batchName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", batchPsp=" + batchPsp +
                ", batchAttendance=" + batchAttendance +
                '}';
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public double getBatchPsp() {
        return batchPsp;
    }

    public void setBatchPsp(double batchPsp) {
        this.batchPsp = batchPsp;
    }

    public double getBatchAttendance() {
        return batchAttendance;
    }

    public void setBatchAttendance(double batchAttendance) {
        this.batchAttendance = batchAttendance;
    }
}
