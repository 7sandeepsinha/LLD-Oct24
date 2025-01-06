package designpatterns.decorator;

public class ChocolateSyrup implements IceCream{
    private IceCream iceCream;
    private int cost;

    public ChocolateSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 25;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Chocolate Syrup";
    }
}
