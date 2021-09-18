package com.c332030.central.control;

import java.util.function.Consumer;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import com.c332030.central.control.model.exception.TokenExpiredException;

/**
 * <p>
 * Description: CentralControlClient
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CentralControlClient {

    private boolean retryOnTokenExpired;

    private int retryTimes;

    public void operate(Consumer<String> tokenConsumer) {

        var retryTimes = 0;

        while (true) {
            try {

                tokenConsumer.accept("");
                break;
            } catch (TokenExpiredException e) {
                if(!retryOnTokenExpired || ++retryTimes >= this.retryTimes) {
                    throw e;
                }
            }
        }
    }

}
