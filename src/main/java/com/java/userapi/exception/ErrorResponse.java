package com.java.userapi.exception;

import java.util.List;

public class ErrorResponse
{
    public ErrorResponse(String message, List<String> details, Integer statusCode) {
        this.message = message;
        this.details = details;
        this.statusCode = statusCode;
    }

    public ErrorResponse(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }

    //General error message about nature of error
    private String message;

    //Specific errors in API request processing
    private List<String> details;

    private Integer statusCode;

    public Integer getStatusCode() {
        return statusCode;
    }

    public ErrorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
//Getter and setters

    public String getMessage() {
        return message;
    }

    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<String> getDetails() {
        return details;
    }

    public ErrorResponse setDetails(List<String> details) {
        this.details = details;
        return this;
    }
}