package com.c332030.central.control.model.exception;

import com.c332030.central.control.enums.WeChatErrorEnum;

/**
 * <p>
 * Description: TokenExpiredException
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public class TokenExpiredException extends CentralControlException {
    private static final long serialVersionUID = 6659459224712874869L;

    public TokenExpiredException() {
        super(WeChatErrorEnum.WeChatErrorEnum);
    }

}
