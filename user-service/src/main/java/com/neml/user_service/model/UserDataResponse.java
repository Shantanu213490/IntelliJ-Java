package com.neml.user_service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class UserDataResponse {

    private String errorCode;
    private String message;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserDataResponse{" +
                "errorCode='" + errorCode + ", message='" + message + '}';
    }
}
