package Generics;

public class BoundedGenericsDemo {
    public static <T extends Number> double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }
}
