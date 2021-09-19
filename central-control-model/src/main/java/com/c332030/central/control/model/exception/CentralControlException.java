package com.c332030.central.control.model.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.c332030.central.control.enums.WeChatErrorEnum;
import com.c332030.central.control.enums.base.ICCErrorEnum;

/**
 * <p>
 * Description: CentralControlException
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CentralControlException extends RuntimeException {

    private static final long serialVersionUID = 3080806953447739121L;

    private final ICCErrorEnum<?> errorEnum;

    public CentralControlException(ICCErrorEnum<?> errorEnum, String message) {
        super(message);
        this.errorEnum = errorEnum;
    }

    public CentralControlException(WeChatErrorEnum weChatErrorEnum) {
        this(weChatErrorEnum, null);
    }

    public CentralControlException(String message) {
        this(null, message);
    }
}
