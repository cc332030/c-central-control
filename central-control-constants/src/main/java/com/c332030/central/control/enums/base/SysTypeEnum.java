package com.c332030.central.control.enums.base;

import com.c332030.constant.enums.base.IEnum;

/**
 * <p>
 * Description: SysTypeEnum
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
public enum SysTypeEnum implements IEnum {

    WECHAT("微信"),

    ALIPAY("支付宝"),

    ;

    /**
     * 描述
     */
    private final String text;

    SysTypeEnum(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

}
