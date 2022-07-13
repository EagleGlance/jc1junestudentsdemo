package com.noirix.exception;

public class NoSuchEntityException extends RuntimeException {

    private String customMessage;

    private Long errorCode;

    public NoSuchEntityException(String customMessage, Long errorCode) {
        this.customMessage = customMessage;
        this.errorCode = errorCode;
    }

    public NoSuchEntityException(String message, String customMessage, Long errorCode) {
        super(message);
        this.customMessage = customMessage;
        this.errorCode = errorCode;
    }

    public NoSuchEntityException(String message, Throwable cause, String customMessage, Long errorCode) {
        super(message, cause);
        this.customMessage = customMessage;
        this.errorCode = errorCode;
    }

    public NoSuchEntityException(Throwable cause, String customMessage, Long errorCode) {
        super(cause);
        this.customMessage = customMessage;
        this.errorCode = errorCode;
    }

    public NoSuchEntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String customMessage, Long errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.customMessage = customMessage;
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "NoSuchEntityException{" +
                "customMessage='" + customMessage + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
