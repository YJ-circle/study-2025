package com.inspire12.likelionbackend.exception;

public class NotFoundCartException extends RuntimeException {

    public NotFoundCartException(final Long userId) {
        super("해당 유저의 카트를 찾을 수 없습니다. userId: "+ userId);
    }
}
