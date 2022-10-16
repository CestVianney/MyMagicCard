package com.mymagiccard.domain.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorEnum {
    USER_NOT_FOUND("user.not.found"),
    DECK_NOT_FOUND("deck.not.found");

    private final String code;
}
