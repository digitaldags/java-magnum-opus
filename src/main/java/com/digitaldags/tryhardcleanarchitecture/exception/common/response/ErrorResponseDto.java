package com.digitaldags.tryhardcleanarchitecture.exception.common.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;


public class ErrorResponseDto<T> extends ResponseEntity<ApiResponse<T>> {
    public ErrorResponseDto(HttpStatus status) {
        super(status);
    }

    public ErrorResponseDto(List<ApiError> errors, HttpStatus status) {
        super(new ApiResponse<>(status.value(), errors), status);
    }

    public static ErrorResponseDto<?> genericError(HttpStatus code, String value) {
        return genericError(code, value, null);
    }

    public static ErrorResponseDto<?> genericError(
            HttpStatus code,
            String value,
            String description
    ) {
        List<ApiError> errors = new ArrayList<>();
        errors.add(new ApiError(0L, value, description));

        return new ErrorResponseDto<>(errors, code);
    }
}
