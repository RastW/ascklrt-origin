package com.ascklrt.common.util;

import org.springframework.beans.BeanUtils;

/**
 * @author goumang
 * @description
 * @date 2022/4/10 12:01 上午
 */
public class BeanUtil {

    // 切换bean
    public static <T> T switchBean(Object object, Class<T> clazz) {
        if (object == null) {
            return null;
        }

        T newObj = null;
        BeanUtils.copyProperties(object, newObj);
        return newObj;
    }
}
