package labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSorter {

    public void sortStudentsByAgeDescending(List<Student> students){
        students.sort(new StudentAgeSorter());
    }

    public static void main(String[] args) {
        StudentSorter studentSorter = new StudentSorter();
        Student s1 = new Student("A", 10);
        Student s2 = new Student("B", 20);
        Student s3 = new Student("C", 30);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        studentSorter.sortStudentsByAgeDescending(students);
        System.out.println(students);
    }
}


class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentAgeSorter implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}

/*
You are given a class Student which stores the data of each student.
The Student class has two variables, name and age. Now you are given a list of Student
and you need to sort the given list of students according to their age in descending order,
i.e. the student with the highest age comes first and the student with the lowest age comes last.

Note: You do not have to create a new list of students, just sort the given list according to age in descending order.

Instructions
Implement the sortStudentsByAgeDescending method inside the StudentSorter class.
Sort the list in descending order of age.
If two or more Students have the same age then keep them in the same order as they appear in the input list.
The code for class Student is already implemented.
Use Comparator to sort the given list.
 */

// break -> 10:22 PM