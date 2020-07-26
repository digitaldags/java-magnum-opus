package com.digitaldags.tryhardcleanarchitecture.exception.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiResponse<T> {
    private int code;
    private T data;
    private List<ApiError> errors;


    public ApiResponse(int code, List<ApiError> errors) {
        this(code, null, errors);
    }


}
