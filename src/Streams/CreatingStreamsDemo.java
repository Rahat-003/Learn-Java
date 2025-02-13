package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show () {
        var list = new ArrayList<>();
        int[] numbers = {1, 2, 3, 4};
        Arrays.stream(numbers)
                .forEach( i -> System.out.print(i + " "));

        var stream = Stream.generate(() -> Math.random());

        stream
                .limit(10)
                .forEach( i -> System.out.print(i + " "));

        System.out.println();
        
        Stream.iterate(5, i -> i + 1)
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
    }
}
