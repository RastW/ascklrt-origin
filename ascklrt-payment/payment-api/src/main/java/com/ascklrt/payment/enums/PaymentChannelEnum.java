package com.ascklrt.payment.enums;

import java.util.Objects;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 5:45 下午
 */
public enum PaymentChannelEnum {

    ALIPAY(1),

    WECHAT(2),
    ;


    private final Integer code;

    public Integer getCode() {
        return code;
    }

    PaymentChannelEnum(Integer code) {
        this.code = code;
    }

    public static PaymentChannelEnum getByCode(Integer code) {
        PaymentChannelEnum[] values = PaymentChannelEnum.values();

        for (PaymentChannelEnum paymentChannelEnum : values) {
            if (Objects.equals(paymentChannelEnum.getCode(), code)) {
                return paymentChannelEnum;
            }
        }
        return null;
    }
}
