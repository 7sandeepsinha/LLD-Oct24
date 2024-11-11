package OOP2_AccessModifier_Constructor;

public class Student {
    private String name;
    private int roll;

    public Student(int stRoll, String stName){
        roll = stRoll;
        name = stName;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRoll(){
        return roll;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }
}

// Door -> unlocked
// Door -> locked -> multiple keys [ choose who can have the key ]

