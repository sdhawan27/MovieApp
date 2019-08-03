package com.catalystone.mbs.exception.handler;

import com.catalystone.mbs.exception.AdminException;
import com.catalystone.mbs.exception.UserException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
@Slf4j
public class ErrorAdvice {

    @ExceptionHandler({UserException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleUserException(UserException e) {
    }

    @ExceptionHandler({AdminException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleAdminException(AdminException e) {
    }

    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void handleRuntimeException(RuntimeException e) {
    }
}
