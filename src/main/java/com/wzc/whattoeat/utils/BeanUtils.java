package com.wzc.whattoeat.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 〈一句话功能简述〉object与map转换的工具类<br>
 *
 * @author PrinceCheng
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BeanUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeanUtils.class);

    private BeanUtils() {
    }

    /**
     * 属性拷贝，并返回对象
     *
     * @param source Object
     * @param clazz  对象类型
     * @param <T>    对象类型
     * @return 目标对象
     */
    public static <T> T copyProperties(Object source, Class<T> clazz) {
        // judge blank
        if (null == source) {
            return null;
        }
        T target = null;
        try {
            target = clazz.newInstance();
            org.springframework.beans.BeanUtils.copyProperties(source, target);
        } catch (IllegalAccessException | InstantiationException e) {
            LOGGER.error("copyProperties ERROR:source=" + source, e);
        }
        return target;
    }

}
