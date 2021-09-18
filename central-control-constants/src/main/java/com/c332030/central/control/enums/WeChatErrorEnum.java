package com.c332030.central.control.enums;

import com.c332030.constant.enumerable.IEnum;

/**
 * <p>
 * Description: WeChatErrorEnum
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public enum WeChatErrorEnum implements IEnum {

    WeChatErrorEnum("WeChatErrorEnum"),

    WeChatErrorEnum2("WeChatErrorEnum2");

    /**
     * 描述
     */
    private final String text;

    WeChatErrorEnum(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
