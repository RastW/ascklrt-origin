package com.ascklrt.payment.pay.dto.request;

import com.ascklrt.payment.enums.PaymentChannelEnum;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 5:43 下午
 */
public class PayRequest {
    private PaymentChannelEnum paymentChannel;

    private Long amount;

    public PaymentChannelEnum getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(PaymentChannelEnum paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = PaymentChannelEnum.getByCode(paymentChannel);
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
