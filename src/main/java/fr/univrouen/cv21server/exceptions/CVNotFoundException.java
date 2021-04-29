package fr.univrouen.cv21server.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CVNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1;

    public CVNotFoundException(String message) {
        super(message);
    }

    public CVNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}