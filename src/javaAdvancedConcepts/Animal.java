package javaAdvancedConcepts;

public class Animal {

    private final int x = 10;
    public final int y;

    public Animal(int y) {
        this.y = y;
    }

    public final void run(){
        System.out.println("Animal is running at 5 kmph");
    }
}
