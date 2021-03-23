package com.synec.cityservice.model.response;


import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

public class InternalServerErrorResponse<T> extends SynecResponse<T> {

    public InternalServerErrorResponse(String message) {
        this(Arrays.asList(new ResponseError(message)));
    }

    public InternalServerErrorResponse(List<ResponseError> errors) {
        super(null, errors, INTERNAL_SERVER_ERROR);
    }
}
