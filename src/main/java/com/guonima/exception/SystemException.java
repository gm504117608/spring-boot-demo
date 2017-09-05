package com.guonima.exception;

/**
 * @author guonima
 * @create 2017-09-05 11:52
 */
public class SystemException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 2119718747432466934L;

    public SystemException() {
        super();
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(String message, Throwable cause,
                           boolean enableSuppression,
                           boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
