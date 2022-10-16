package com.swagger.swaggerApi.adapters.api.advice;

import com.swagger.swaggerApi.domain.exceptions.NotFoundException;
import com.swagger.swaggerApi.domain.utils.MessageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionApiAdvice extends ResponseEntityExceptionHandler {

    private final MessageUtils messageUtils;

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ErrorResponse handleNotFoundException(NotFoundException nfe) {
        return new ErrorResponse(messageUtils.findMessage(nfe.getError().getCode(), nfe.getParams()));
    }
}
