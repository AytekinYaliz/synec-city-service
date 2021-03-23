package com.synec.cityservice.model.response;


import java.util.Arrays;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class NotFoundResponse extends SynecResponse {

    public NotFoundResponse(String message) { super(null, Arrays.asList(new ResponseError(message)), NOT_FOUND); }
}
