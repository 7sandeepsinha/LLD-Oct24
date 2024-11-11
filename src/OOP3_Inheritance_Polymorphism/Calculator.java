package OOP3_Inheritance_Polymorphism;

public class Calculator {

    public void add(int x, int y){ // add(int, int)
        System.out.println("Sum : " + (x+y));
    }

    public void add(double x, double y){ // add(double, double)
        System.out.println("Sum : " + (x+y));
    }

    public void add(int x, double y){ // add(int, double)
        System.out.println("Sum : " + (x+y));
    }

    public void add(double x, int y){ // add(double, int)
        System.out.println("Sum : " + (x+y));
    }
}
