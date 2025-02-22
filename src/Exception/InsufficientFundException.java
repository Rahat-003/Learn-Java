package Exception;

/**
 * Extends following class for custom exception
 * Checked -> Exception
 * Unchecked (runtime) -> RuntimeException
 *
 */

public class InsufficientFundException extends Exception{
    public InsufficientFundException() {
        super("Insufficient funds in your account!");
    }
    public InsufficientFundException(String msg) {
        super(msg);
    }
}
