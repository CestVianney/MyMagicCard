package com.swagger.swaggerApi.domain.exceptions;

import com.swagger.swaggerApi.domain.enumeration.ErrorEnum;

public class FunctionalException extends BaseException {
    public FunctionalException(ErrorEnum error, Object... params) {super(error, params);}
}
