package designpatterns.decorator;

public class ChocolateChip implements IceCream{
    private IceCream iceCream;
    private int cost;

    public ChocolateChip(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 20;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Choco chips";
    }
}
