package com.ascklrt.payment.pay.factory;

import com.ascklrt.payment.enums.PaymentChannelEnum;
import com.ascklrt.payment.pay.handler.PayHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author goumang
 * @description
 * @date 2022/4/7 6:30 下午
 */
@Component
public class PayHandlerFactory implements InitializingBean, ApplicationContextAware {

    private final static Map<PaymentChannelEnum, PayHandler> PAY_HANDLER_MAP = new HashMap<>(8);

    private ApplicationContext applicationContext;

    /**
     * 获取处理器
     * @author wangjiawei
     * @date 2022/4/7 6:34 下午
     * @param paymentChannel
     * @return com.ascklrt.payment.pay.handler.PayHandler
     */
    public PayHandler getPayHandler(PaymentChannelEnum paymentChannel) {
        return PAY_HANDLER_MAP.get(paymentChannel);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        applicationContext.getBeansOfType(PayHandler.class)
                .values()
                .forEach(payHandler -> PAY_HANDLER_MAP.put(payHandler.getPaymentChannel(), payHandler));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
