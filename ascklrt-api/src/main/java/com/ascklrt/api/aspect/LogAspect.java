package com.ascklrt.api.aspect;

import cn.hutool.json.JSONUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author wangjiawei
 * @description
 * @date 2022/4/3 4:20 下午
 */

@Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 使用注解方式，
     * 或：
     * '@Pointcut("execution(* com.ascklrt.api.*.*(..))")'
     * 或：被注解方法类的所有方法
     * "@within(com.ascklrt.common.annotation.DescriptionLog)"
     * 或：被注解的方法
     * Pointcut("@annotation(com.ascklrt.common.annotation.DescriptionLog)")
     *
     * @param
     * @return void
     * @author goumang
     * @date 2022/4/3 5:40 下午
     */
    @Pointcut("@within(com.ascklrt.common.annotation.DescriptionLog)")
    public void descriptionLogPointCut() {
    }

    /**
     * 调用前日志
     *
     * @param joinPoint
     * @return void
     * @author goumang
     * @date 2022/4/3 5:43 下午
     */
    @Before("descriptionLogPointCut()")
    public void doBeforePrint(JoinPoint joinPoint) {
        // 类.方法: {参数}
        logger.info("descriptionLog-enter {} . {}: {}",
                joinPoint.getSignature().getDeclaringType().getSimpleName(),
                joinPoint.getSignature().getName(),
                JSONUtil.toJsonStr(joinPoint.getArgs())
        );
    }

    // 顺序，必须returning写在前面，否则不生效
    @AfterReturning(pointcut = "descriptionLogPointCut()", returning = "returnObj")
    public void doAfterReturningCommonResultPrint(Object returnObj) {
        // 类.方法: {参数}
        logger.info("descriptionLog-return :{}",
                JSONUtil.toJsonStr(returnObj)
        );
    }

}
