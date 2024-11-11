package OOP4_InterfacesAndAbstractClasses.upcastingDownCasting;

public class Student {
    private int id;
    private String name;
    private static String schoolName;

    public void study(){
        System.out.println("Different logic can be here");
    }

    public static void morningPrayer(){
        System.out.println("All students are praying");
    }
}
