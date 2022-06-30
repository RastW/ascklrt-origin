package com.ascklrt.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author goumang
 * @description 发送邮件flowable委托
 * @date 2022/6/24 14:38
 */
public class SendMail implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("send mail");
    }
}
