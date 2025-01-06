package designpatterns.decorator;

//add on -> cant be used to create ice cream from scratch
public class VanillaScoop implements IceCream{
    private IceCream iceCream;
    private int cost;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 30;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Vanilla Scoop";
    }
}
