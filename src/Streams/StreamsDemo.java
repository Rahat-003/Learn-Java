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
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)


        );

        Stream<Movie> stream = movies.stream();

        var result = movies.stream()
                        .collect(Collectors.groupingBy(
                                Movie::getGenre,
                                Collectors.mapping(
                                        Movie::getTitle,
                                        Collectors.joining(", ")
                                )
                        ));

        System.out.println(result);

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
