package com.swagger.swaggerApi.domain.exceptions;

import com.swagger.swaggerApi.domain.enumeration.ErrorEnum;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{

    private final ErrorEnum error;

    private final Object[] params;

    public BaseException(ErrorEnum error, Object... params){
        super(error.getCode());
        this.error = error;
        this.params = params;
    }

}
