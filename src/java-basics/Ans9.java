class NoStackTraceException extends Exception {
    public NoStackTraceException(String message) {
        super(message, null, false, false);
    }
}

public class Ans9 {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This is a custom exception without stack trace!");
        } catch (NoStackTraceException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}