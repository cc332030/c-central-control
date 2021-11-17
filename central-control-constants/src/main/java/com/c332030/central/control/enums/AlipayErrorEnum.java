package com.c332030.central.control.enums;

import com.c332030.central.control.enums.base.CCErrorTypeEnum;
import com.c332030.central.control.enums.base.ICCErrorEnum;

/**
 * <p>
 * Description: AlipayErrorEnum
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public enum AlipayErrorEnum implements ICCErrorEnum<Integer> {

    AlipayErrorEnum("AlipayErrorEnum"),

    AlipayErrorEnum2("AlipayErrorEnum2"),

    ;

    /**
     * 描述
     */
    private final String text;

    AlipayErrorEnum(String text) {
        this.text = text;
    }

    @Override
    public CCErrorTypeEnum getType() {
        return null;
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getText() {
        return text;
    }

}
