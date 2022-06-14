package com.ascklrt.payment;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author goumang
 * @description
 * @date 2022/4/9 11:42 下午
 */
@SpringBootApplication
@EnableDubbo
public class AscklrtPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscklrtPaymentApplication.class, args);
    }
}
