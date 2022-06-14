package com.ascklrt.api.payment.controller;

// import com.alibaba.dubbo.config.annotation.Reference;
import com.ascklrt.common.annotation.DescriptionLog;
import com.ascklrt.api.model.CommonResult;
import com.ascklrt.api.payment.vo.PayVO;
import com.ascklrt.common.util.SwitchUtil;
import com.ascklrt.payment.enums.PaymentChannelEnum;
import com.ascklrt.payment.pay.dto.request.PayRequest;
import com.ascklrt.payment.pay.dto.response.PayResponse;
import com.ascklrt.payment.pay.service.PayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestBody;
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

    @DubboReference
    PayService payService;

    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public CommonResult<PayResponse> pay(@RequestBody PayVO payVO) {
        PayRequest payRequest = SwitchUtil.switchBean(payVO, PayRequest.class);
        payRequest.setPaymentChannel(PaymentChannelEnum.getByCode(payVO.getPayChannel()));
        PayResponse response = payService.pay(payRequest);
        return new CommonResult<>(true, response);
    }
}
