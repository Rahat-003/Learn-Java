package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static  void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            System.out.println("File opened");
//            new SimpleDateFormat().parse("");
        }
//        catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//            System.out.println(System.getProperty("user.dir"));
//        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if(reader != null) {
                try{
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }
}
