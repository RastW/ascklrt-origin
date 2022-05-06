package com.ascklrt.api.payment.controller;

import com.ascklrt.common.annotation.DescriptionLog;
import com.ascklrt.api.model.CommonResult;
import com.ascklrt.api.payment.vo.PayVO;
import com.ascklrt.common.util.BeanUtil;
import com.ascklrt.payment.pay.dto.request.PayRequest;
import com.ascklrt.payment.pay.dto.response.PayResponse;
import com.ascklrt.payment.pay.service.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author goumang
 * @description
 * @date 2022/4/9 11:56 下午
 */
@DescriptionLog
@RestController
@RequestMapping("/payment/pay")
public class PayController {

    @Reference
    PayService payService;

    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    CommonResult<PayResponse> pay(PayVO payVO) {
        PayResponse response = payService.pay(BeanUtil.switchBean(payVO, PayRequest.class));
        return new CommonResult<>(true, response);
    }
}
