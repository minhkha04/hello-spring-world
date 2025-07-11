package com.emkay.coffee;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class ApiResponse<Object> {
    private String message;
    private Object result;

    public ApiResponse(String message, Object result) {
        this.message = message;
        this.result = result;
    }
}
