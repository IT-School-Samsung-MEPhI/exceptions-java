package example4;

class RiskyProcessException extends RuntimeException {
    public RiskyProcessException() {
        super("Risky process ended with exception");
    }
}