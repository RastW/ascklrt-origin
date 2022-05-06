package com.ascklrt.payment.pay.service;

import com.ascklrt.payment.pay.dto.request.PayRequest;
import com.ascklrt.payment.pay.dto.response.PayResponse;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 2:49 下午
 */
public interface PayService {

    PayResponse pay(PayRequest payRequest);
}
