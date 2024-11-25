package javaAdvancedConcepts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(10);
        //animal.y = 20;
        //Cannot assign a value to final variable 'y'

        ModernCar modernCar = new ModernCar();
        modernCar.demo();
        modernCar.run();

        Pair<Integer, String> idNamePair = new Pair<>();
        idNamePair.setKey(1);
        idNamePair.setValue("Anil");

        //idNamePair.setValue(new Car()); -- not doable as object has types Integer and String


        Pair<Car, Animal> carAnimalPair = new Pair<>();
        // key -- car
        // value -- animal

        List<Integer> list = new ArrayList<>();



    }
}
