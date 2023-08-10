package com.vrcs.livemenu.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StatusCodeInvalid extends RuntimeException {

    public StatusCodeInvalid(String message) {
        super(message);
    }

}