package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static  void show() {
        try(
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("output.txt");
        ) {
            var value = reader.read();
        }
        catch (IOException e) {
            System.out.println("Could not read data");
        }
    }
}
