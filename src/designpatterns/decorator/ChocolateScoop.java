package designpatterns.decorator;

public class ChocolateScoop implements IceCream{
    private IceCream iceCream;
    private int cost;

    public ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 40;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Scoop";
    }
}
