// package com.synec.cityservice.model.response;
//
//
// import java.util.Arrays;
// import java.util.List;
//
// import static org.springframework.http.HttpStatus.UNAUTHORIZED;
//
// public class UnauthorizedResponse extends SynecResponse {
//
//     public UnauthorizedResponse(String message) {
//         this(Arrays.asList(new ResponseError(message)));
//     }
//
//     public UnauthorizedResponse(List<ResponseError> errors) {
//         super(null, errors, UNAUTHORIZED);
//     }
// }