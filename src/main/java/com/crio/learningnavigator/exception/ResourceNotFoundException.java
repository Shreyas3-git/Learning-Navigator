package com.crio.learningnavigator.exception;

import com.crio.learningnavigator.service.ErrorCode;

import java.time.LocalDateTime;

public class ResourceNotFoundException extends RuntimeException
{
    private final LocalDateTime timestamp;
    private final long userId;
    private final ErrorCode errorCode;

    public ResourceNotFoundException(ErrorCode errorCode, long userId) {
        super(errorCode.getMessage(userId));
        this.timestamp = LocalDateTime.now();
        this.userId = userId;
        this.errorCode = errorCode;
    }

}
