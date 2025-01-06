package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateChip(
                                new ChocolateScoop(
                                    new VanillaScoop(
                                        new ChocolateCone(
                                            new ChocolateSyrup(
                                                new VanillaCone())))));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}

//ChocoChips
// [ChocoScoop
// [VanillaScoop
// [ChocoCone
// [ChocoSyrup
// [vanilla cone]]]]]