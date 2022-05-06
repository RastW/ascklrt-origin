package com.ascklrt.payment.pay.handler;

import com.ascklrt.payment.enums.PaymentChannelEnum;
import com.ascklrt.payment.pay.dto.request.PayRequest;
import com.ascklrt.payment.pay.dto.response.PayResponse;

import java.io.Serializable;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 5:53 下午
 */
public interface PayHandler<R extends Serializable> {

    /**
     * 获取支付渠道
     * @author wangjiawei
     * @date 2022/4/7 5:54 下午
     * @param
     * @return com.ascklrt.payment.enums.PaymentChannelEnum
     */
    PaymentChannelEnum getPaymentChannel();

    /**
     * 支付
     * @author wangjiawei
     * @date 2022/4/7 6:16 下午
     * @param payRequest
     * @return com.ascklrt.payment.pay.dto.response.PayResponse
     */
    PayResponse pay(PayRequest payRequest);
}
