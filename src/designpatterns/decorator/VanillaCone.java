package designpatterns.decorator;

// base add on -> can be created without any prior ice cream object
public class VanillaCone implements IceCream{
    private IceCream iceCream;
    private int cost;

    public VanillaCone() {
        iceCream = null;
        cost = 10;
    }

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 10;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Vanilla Cone";
        } else {
            return iceCream.getDescription() + ", Vanilla Cone";
        }
    }
}
