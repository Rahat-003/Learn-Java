package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
    public static void main(String args[]) {
        System.out.println("Optional Main Initiated");

        List<String> names = Arrays.asList("Redmi", "Xiaomi", "SpaceX");

        Optional<String> name = names.stream()
                .filter(str -> str.contains("i"))
                .findFirst();

        System.out.println("Finding first element having " + " - " + name.orElse("Not Found"));
    }
}
