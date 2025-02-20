package Generics;

public class BoundedGenericsExample {
    public static void main(String[] args) {
        System.out.println("Square of   4: " + BoundedGenericsDemo.square(4));
        System.out.println("Square of 5.5: " + BoundedGenericsDemo.square(5.5));

        String a = "Rahat";
        String b = "rahat";
        // 0 means equal
        System.out.println("String comparison: " + a.compareTo(b));

        Integer x = 10;
        Integer y = 10;
        // 0 means equal
        System.out.println("Integer comparison: " + x.compareTo(y));
    }
}
