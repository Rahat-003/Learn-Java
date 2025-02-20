package Generics;

import java.util.Arrays;

public class GenericMethodExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};

        GenericMethodDemo.printArray(intArray);
        GenericMethodDemo.printArray(strArray);
    }
}
