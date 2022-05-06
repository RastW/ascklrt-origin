package com.ascklrt.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author wangjiawei
 * @description
 * @date 2022/4/3 4:16 下午
 */
@Target(ElementType.TYPE)
public @interface DescriptionLog {

    String value() default "default";
}
