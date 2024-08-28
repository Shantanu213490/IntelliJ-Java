package com.neml.user_service.exceptions;

import com.neml.user_service.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionsHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> ResourceNotFoundExceptionHandler(ResourceNotFoundException exception){

       String msg =  exception.getMessage();
        ApiResponse apiResponse =  ApiResponse.builder().message(msg).isSuccess(true).httpStatus(HttpStatus.NOT_FOUND).build();

        return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);

    }


}
