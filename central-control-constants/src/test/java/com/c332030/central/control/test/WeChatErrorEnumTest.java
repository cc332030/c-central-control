package com.c332030.central.control.test;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

import com.c332030.central.control.enums.WeChatErrorEnum;
import com.c332030.util.data.JsonUtils;

/**
 * <p>
 * Description: WeChatErrorEnumTest
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Slf4j
public class WeChatErrorEnumTest {

    @Test
    public void test() {

        String json = JsonUtils.toJson(WeChatErrorEnum.CODE_MAP);
        log.info("json: {}", json);
    }

}
