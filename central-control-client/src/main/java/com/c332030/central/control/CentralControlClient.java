package com.c332030.central.control;

import java.util.function.Consumer;

import lombok.Builder;

import com.c332030.central.control.model.exception.CentralControlException;

/**
 * <p>
 * Description: CentralControlClient
 * </p>
 *
 * @author c332030
 * @version 1.0
 */
@Builder
public class CentralControlClient {

    private boolean retryOnTokenExpired;

    private int retryTimes;

    public void operate(Consumer<String> tokenConsumer) {

        var retryTimes = 0;

        while (true) {
            try {

                tokenConsumer.accept("");
                break;
            } catch (CentralControlException e) {

                switch (e.getErrorEnum().getType()) {
                    case TOKEN_EXPIRE:
                        if(!retryOnTokenExpired || ++retryTimes >= this.retryTimes) {
                            throw e;
                        }
                        break;
                }
            }
        }
    }

}
