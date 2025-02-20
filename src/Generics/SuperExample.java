package Generics;

import java.util.*;

public class SuperExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);  // ✅ Allowed
        list.add(20);  // ✅ Allowed
//         Integer num = list.get(0); //❌ NOT ALLOWED (Type mismatch)
    }

    public static void changeVal(Box<Integer> B) {
        B.set(100 + 34);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addNumbers(intList);    // ✅ Allowed (Integer is Integer)
        addNumbers(numberList); // ✅ Allowed (Number is a superclass of Integer)
        addNumbers(objectList); // ✅ Allowed (Object is a superclass of Integer)

        System.out.println("Super Example: " + intList);

        Box<Integer> box = new Box<>();
        
        System.out.println(box.get());

    }

}
