package com.digitaldags.tryhardcleanarchitecture.exception.common.controller;

import com.digitaldags.tryhardcleanarchitecture.exception.common.GenericException;
import com.digitaldags.tryhardcleanarchitecture.exception.common.response.ErrorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ExceptionController {
    @ExceptionHandler(value = GenericException.class)
    public ErrorResponseDto generic(GenericException e) {
        return ErrorResponseDto.genericError(HttpStatus.UNPROCESSABLE_ENTITY, e.getMessage());
    }
}
