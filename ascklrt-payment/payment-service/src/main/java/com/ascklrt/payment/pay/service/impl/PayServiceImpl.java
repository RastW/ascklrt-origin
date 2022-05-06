package com.ascklrt.payment.pay.service.impl;

import com.ascklrt.payment.pay.dto.request.PayRequest;
import com.ascklrt.payment.pay.dto.response.PayResponse;
import com.ascklrt.payment.pay.factory.PayHandlerFactory;
import com.ascklrt.payment.pay.service.PayService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 5:48 下午
 */
@Service
public class PayServiceImpl implements PayService {

    private static final Logger logger = LoggerFactory.getLogger(PayServiceImpl.class);

    @Autowired
    PayHandlerFactory payHandlerFactory;

    @Override
    public PayResponse pay(PayRequest payRequest) {
        PayResponse payResponse = payHandlerFactory.getPayHandler(payRequest.getPaymentChannel())
                .pay(payRequest);
        return payResponse;
    }
}
