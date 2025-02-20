package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class _Map {

    public static void main(String[] args) {
        System.out.println("Main from Map");

        Map<String, Integer> students = new Hashtable<>();
        students.put("John", 1);
        students.put("Jane", 2);
        students.put("Jack", 3);
        students.put("Mary", 4);
        students.put("Bob", 5);

        System.out.println(students);

        System.out.println(students.get("John"));
    }

}
