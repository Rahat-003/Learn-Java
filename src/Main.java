import Design_Pattern.Memento.Editor;
import Design_Pattern.Memento.History;
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
//        StreamsDemo.show();

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.setContent("d");




    }
}