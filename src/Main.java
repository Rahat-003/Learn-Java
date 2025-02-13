import Design_Pattern.Memento.Editor;
import Streams.CreatingStreamsDemo;
import Streams.Movie;
import Streams.StreamsDemo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class node {
    public static int square (int n, int x) {
        return n * x;
    }

}


public class Main {
    public static void main(String[] args) {
        StreamsDemo.show();

        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.setContent("d");



//        CreatingStreamsDemo.show();
//        Using method reference
//        Function<Integer, Integer> sqFunction = node::square;
//        System.out.println(sqFunction.apply(9));

//        List<String> cities = (List.of("Dhaka", "Chittagong", "Rajshahi", "Khulna"));
//        List<Integer> nums = Arrays.asList(4,5,3,6,2,1);
//
//        Stream<Integer> numsStream = nums.stream();
//
//        Predicate<Integer> cond = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer t) {
//                return t % 2 == 1;
//            }
//        };








    }
}