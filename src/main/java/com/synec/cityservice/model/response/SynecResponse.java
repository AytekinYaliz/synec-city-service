package com.synec.cityservice.model.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class SynecResponse<T> extends ResponseEntity<ResponseBody> {

    public SynecResponse(T metadata, List<ResponseError> errors, HttpStatus status) {
        super(new ResponseBody(metadata, errors, status), status);
    }
}
