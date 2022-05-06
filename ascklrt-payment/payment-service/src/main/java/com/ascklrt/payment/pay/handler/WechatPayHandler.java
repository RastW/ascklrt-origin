package com.ascklrt.payment.pay.handler;

import com.ascklrt.payment.enums.PaymentChannelEnum;
import com.ascklrt.payment.pay.dto.request.PayRequest;
import com.ascklrt.payment.pay.dto.response.PayResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 6:19 下午
 */
public class WechatPayHandler implements PayHandler{

    private final static Logger logger = LoggerFactory.getLogger(WechatPayHandler.class);

    @Override
    public PaymentChannelEnum getPaymentChannel() {
        return PaymentChannelEnum.WECHAT;
    }

    @Override
    public PayResponse pay(PayRequest payRequest) {
        logger.info("Alipay pay is success! amunt: {}", payRequest.getAmount());

        return new PayResponse();
    }
}
