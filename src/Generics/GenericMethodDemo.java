package Generics;


class GenericMethodDemo {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}