package com.c332030.central.control.enums.base;

import com.c332030.constant.enums.base.IEnum;

/**
 * <p>
 * Description: CCErrorTypeEnum
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public enum CCErrorTypeEnum implements IEnum {

    TOKEN_EMPTY("token为空"),

    TOKEN_EXPIRE("token失效"),

    ;

    /**
     * 描述
     */
    private final String text;

    CCErrorTypeEnum(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

}
