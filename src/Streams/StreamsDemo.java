package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void show () {
        List<Movie> movies = List.of(
                new Movie("d", 35),
                new Movie("c", 30),
                new Movie("b", 20),
                new Movie("a", 25),
                new Movie("e", 40)
        );

        Stream<Movie> stream = movies.stream();


        var result = stream
                .filter(m->m.getLikes() > 25)
                        .map(Movie::getTitle)
                                .collect(Collectors.joining(", "));
//                .collect(Collectors.summarizingInt(Movie::getLikes));

        System.out.println(result);

//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(System.out::println);


//        movies.stream()
//                .mapToInt(movie -> movie.getLikes())
//                .forEach(System.out :: println);


//        Imperative Programming
//        int count = 0;
//        for (var movie: movies) {
//            if (movie.getLikes() > 10) {
//                count++;
//            }
//        }
//
//        // Declarative (Functional Programming)
//        int count2 = (int)movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//
//        System.out.println("Count " + count + " Count2 " + count2);
//
    }
}
