package OOP4_InterfacesAndAbstractClasses.abstractClassDemo;

public class BMW extends Car {
    @Override
    public void startEngine() {
        System.out.println("BMW engine start");
    }

    @Override
    public void startAc() {
        System.out.println("BMW AC start");
    }

    public void beemerLights(){
        System.out.println("BMW lights on");
    }

}

/* behaviour was also same
 inheritance
blowHorn(){
    sout(Pow pow);
}
 */