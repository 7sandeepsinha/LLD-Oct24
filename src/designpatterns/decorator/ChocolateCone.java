package designpatterns.decorator;

public class ChocolateCone implements IceCream{
    private IceCream iceCream;
    private int cost;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
        this.cost = iceCream.getCost() + 20;
    }

    public ChocolateCone() {
        this.iceCream = null;
        this.cost = 20;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        if(iceCream == null){
            return "Chocolate Cone";
        } else {
            return iceCream.getDescription() + ", Chocolate Cone";
        }
    }
}
