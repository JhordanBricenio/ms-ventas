package com.code.model.dto;

public record BaseResponse( String [] errors) {

    public boolean hasErrors() {
        return errors != null && errors.length > 0;
    }
}
