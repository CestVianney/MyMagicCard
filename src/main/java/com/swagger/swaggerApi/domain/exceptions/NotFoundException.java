package com.swagger.swaggerApi.domain.exceptions;

import com.swagger.swaggerApi.domain.enumeration.ErrorEnum;

public class NotFoundException extends FunctionalException {

    public NotFoundException(ErrorEnum error, Object... params) {
        super(error, params);
    }

}
