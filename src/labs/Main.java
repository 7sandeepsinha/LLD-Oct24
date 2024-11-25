package labs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Car c1 = new Car(100, 40);
        Car c2 = new Car(120, 76);
        Car c3 = new Car(140, 60);

        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c3);
        cars.add(c2);

        System.out.println(cars); // c1, c3, c2

        Collections.sort(cars);

        System.out.println(cars); // c1 c2 c3 -> default comparable logic

        Collections.sort(cars, new CarPowerComparator());

        System.out.println(cars); // c1 c2 c3 -> default comparable logic

        PriorityQueue<Car> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            int s = scn.nextInt();
            int p = scn.nextInt();
            pq.add(new Car(s, p));
        }

        while (pq.size() > 0) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }

    // implement comparable interface
    static class Car implements Comparable<Car> {
        private int speed;
        private int power;

        public Car(int speed, int power) {
            this.speed = speed;
            this.power = power;
        }

        @Override
        public String toString() {
            return "[S=" + this.speed + ", P=" + this.power + "]";
        }


        @Override
        public int compareTo(Car c) {
            //return this.speed - c.speed;
            return Integer.compare(this.speed, c.speed);
        }
    }

    static class CarPowerComparator implements Comparator<Car>{

        @Override
        public int compare(Car o1, Car o2) {
            return Integer.compare(o1.power, o2.power); //ascending order
            // return Integer.compare(o2.power, o1.power); //descending order
        }
    }
}
//obj1.compare(obj2)
// this == obj1
// current object < specific object -> this < c -> -ve
// current object = specific object -> this = c -> 0
// current object > specific object -> this > c -> +ve