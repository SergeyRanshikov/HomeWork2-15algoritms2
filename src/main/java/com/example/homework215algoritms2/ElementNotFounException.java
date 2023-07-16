package com.example.homework215algoritms2;

public class ElementNotFounException extends RuntimeException {
    public ElementNotFounException() {
    }

    public ElementNotFounException(String message) {
        super(message);
    }

    public ElementNotFounException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFounException(Throwable cause) {
        super(cause);
    }

    public ElementNotFounException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
