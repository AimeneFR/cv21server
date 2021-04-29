package fr.univrouen.cv21server.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CVExistingException extends RuntimeException {

    private static final long serialVersionUID = 1;

    public CVExistingException(String message) {
        super(message);
    }

    public CVExistingException(String message, Throwable throwable) {
        super(message, throwable);
    }
}