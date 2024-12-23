package javaAdvancedConcepts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaStreamsDemo {
    public static void main(String[] args) {
        //LAMBDA TYPES WITH STREAMS
        /*
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2==0) // predicate -> taking n[integer] input and returns a boolean
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Double> doubles =
                Stream.generate(() -> Math.random()) // supplier -> does not take any input and returns anything, here returning a double
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(doubles);

        numbers.stream()
                .filter(n -> n%2!=0)
                .forEach(n -> System.out.print(n + " ")); // consumer -> takes input T[here integer] and returns nothing[void]
        System.out.println();

        numbers.stream()
                .filter(n -> n%2!=0)
                .map(n -> n*4.5) // functions -> takes input[Integer] and returns output[Double]
                .forEach(n -> System.out.print(n + " "));
         */


        List<Integer> integers = List.of(1,2,3,4,5,6,7,8);
        int sum = integers.stream().mapToInt(n -> n*n).sum();
        System.out.println(sum);


        List<String> strings  = List.of("A", "B", "C");
        List<Double> doubles = Stream.generate(() -> Math.random()).limit(5).collect(Collectors.toList());
        printList(integers);
        printList(strings);
        sumOfListData(integers);
        sumOfListData(doubles);
    }



    public static void printList(List<?> list){ // wildcard generic -- unbounded generic, no boundations
        for(Object x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void sumOfListData(List<? extends Number> list){ // any type which is number or child of number -- bounded NUMBER to anything below that
        double sum = 0;
        for(Number n : list){
             sum = n.doubleValue()  + sum;
        }
        System.out.println(sum);
    }

    public static void sumOfListData2(List<? super Integer> list){ // any type which is Integer or parent of Integer -- bounded Integer to anything above that

    }
}
