package com.ascklrt.api;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author goumang
 * @description
 * @date 2022/3/25 4:48 下午
 */
@SpringBootApplication
@EnableDubbo
@ServletComponentScan
public class AscklrtApiApplication {

    /**
     * @author goumang
     * @date 2022/3/25 4:54 下午
     * @param args
     * @return void
     */
    public static void main(String[] args) {
        SpringApplication.run(AscklrtApiApplication.class, args);
    }
}
