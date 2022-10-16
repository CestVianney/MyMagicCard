package com.mymagiccard.domain.exceptions;

import com.mymagiccard.domain.enumeration.ErrorEnum;

public class FunctionalException extends BaseException {
    public FunctionalException(ErrorEnum error, Object... params) {super(error, params);}
}
