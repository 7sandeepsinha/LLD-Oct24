package javaAdvancedConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        IntStream intStream = Arrays.stream(arr);
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,0,232);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(20);
        Stream<Integer> listStream = list.stream();

        Set<Integer> result = list.stream() // list - N || stream - N
                .filter(x -> x%2!=0) // operation - N || stream size - N
                 // operation -  M || stream size - M
                .collect(Collectors.toSet()); // operation - M  || stream size - M
        System.out.println(result);

        integerStream
                .filter(x -> x%2!=0)
                .map(x -> x*x)
                .forEach(x -> System.out.println(x*3));

    }
}
// (a -> a*a)
// ( (a) -> {
//      return a*a;
//     }
//
