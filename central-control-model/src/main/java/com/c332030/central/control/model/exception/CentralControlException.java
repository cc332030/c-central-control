package com.c332030.central.control.model.exception;

/**
 * <p>
 * Description: CentralControlException
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public class CentralControlException extends RuntimeException {

    private static final long serialVersionUID = 3080806953447739121L;

    public CentralControlException() {
        super();
    }

    public CentralControlException(String message) {
        super(message);
    }

    public CentralControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CentralControlException(Throwable cause) {
        super(cause);
    }

    protected CentralControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
