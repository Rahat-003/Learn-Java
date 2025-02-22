package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static  void show() throws IOException {
        try(
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("output.txt");
        ) {
            var value = reader.read();
        }
        catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Could not read data");
            throw e;
        }
    }

    public static void throwException() {
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Message is: " + e.getMessage());
        }
    }

}
