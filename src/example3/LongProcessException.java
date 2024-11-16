package example3;

public class LongProcessException extends Exception {
    public LongProcessException() {
        super("Long process ended with exception");
    }
}
