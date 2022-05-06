package com.ascklrt.api.payment.vo;

/**
 * @author goumang
 * @description
 * @date 2022/4/9 11:59 下午
 */
public class PayVO {

    private Integer payChannel;

    private Long amount;

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
