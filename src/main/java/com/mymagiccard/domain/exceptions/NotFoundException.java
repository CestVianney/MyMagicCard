package com.mymagiccard.domain.exceptions;

import com.mymagiccard.domain.enumeration.ErrorEnum;

public class NotFoundException extends FunctionalException {

    public NotFoundException(ErrorEnum error, Object... params) {
        super(error, params);
    }

}
