package com.digitaldags.tryhardcleanarchitecture.exception.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
    private Long code;
    private String message;
    private String description;
}
