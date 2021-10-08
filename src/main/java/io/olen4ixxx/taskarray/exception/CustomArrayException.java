package io.olen4ixxx.taskarray.exception;

public class CustomArrayException extends Exception {
    public CustomArrayException(String message) {
        super(message);
    }

    public CustomArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomArrayException() {
    }

    public CustomArrayException(Throwable cause) {
        super(cause);
    }
}
