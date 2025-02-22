package Exception;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String args[]) {
        System.out.println("Exceptions main");
        try {
            ExceptionDemo.show();
        } catch (IOException e /*Exception e Or Throwable e*/) {
            System.out.println("Rethrow Exception inside ExceptionDemo.show() method");
        }
//        ExceptionDemo.throwException();
    }
}
