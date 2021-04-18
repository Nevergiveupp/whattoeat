package com.wzc.whattoeat.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author PrinceCheng
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class JsonUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);

    private JsonUtils() {

    }

    private static SerializeConfig mapping = new SerializeConfig();
    private static String dateFormat;
    static {
        dateFormat = "yyyyMMddHHmmss";
    }

    /**
     * 功能描述: <br>
     * JSON串转换为对象
     *
     * @param jsonStr JSON串
     * @return 对象实例，若JSON串为空或类型不匹配等异常，则返回为null
     */
    public static <T> T parseJsonStrToBean(String jsonStr, Class<T> t) {
        if (StringUtils.isEmpty(jsonStr)) {
            return null;
        }
        try {
            return (T) JSONObject.parseObject(jsonStr, t);
        } catch (Exception e) {
            LOGGER.error("parseJsonStrToBean Exception",e);
            return null;
        }
    }

    /**
     * 功能描述: <br>
     * 对象转换为JSON串。
     *
     * @param o 实例对象
     * @return JSON串，若实例对象为null或转换异常，则返回null
     */
    public static String formatBeanToJsonStr(Object o) {
        if (o == null) {
            return null;
        }
        try {
            if (o.getClass().isArray()) {
                return JSONArray.toJSONString(o);
            }
            return JSONObject.toJSONString(o);
        } catch (Exception e) {
            LOGGER.error("formatBeanToJsonStr Exception",e);
            return null;
        }
    }

    /**
     * 功能描述: <br>
     * JSON传转换成LIST
     *
     * @param <T>
     *
     * @param jsonStr 实例对象
     * @return JSON串，若实例对象为null或转换异常，则返回null
     */
    public static <T> List<T> jsonToList(String jsonStr, Class<T> c) {
        if (StringUtils.isEmpty(jsonStr)) {
            return Collections.emptyList();
        }
        return (List<T>) JSONArray.parseArray(jsonStr, c);
    }


    /**
     *
     * @param object
     * @return
     */
    public static String toJSON(Object object)
    {
        return JSON.toJSONString(object, SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteNullListAsEmpty,SerializerFeature.WriteDateUseDateFormat);
    }


    /**
     *
     * 默认的处理时间
     * @param jsonText
     * @return
     */
    public static String toJSONHasDate(Object jsonText) {
        return JSON.toJSONString(jsonText, SerializerFeature.WriteDateUseDateFormat);
    }

    /**
     *
     * 自定义时间格式
     * @param object
     * @return
     */
    public static String toJSON(String dateFormat, Object object) {
        mapping.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
        return JSON.toJSONString(object, mapping);
    }



    /**
     *
     * @param list
     * @param prefix
     * @return
     */
    public static String createJsonString(List<?> list,String prefix) {
        StringBuilder jsonString = new StringBuilder();
        jsonString.append("{");
        jsonString.append("\"").append(prefix).append("\":").append(JSON.toJSONString(list));
        jsonString.append("}");
        return jsonString.toString();
    }

    /**
     *
     * @param jsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T createJsonBean(String jsonString, Class<T> cls) {
        return JSON.parseObject(jsonString, cls);
    }

    /**
     *
     * @param jsonString
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> List<T> createJsonToListBean(String jsonString,
                                                   Class<T> cls) {
        List<T> list = null;
        list = JSON.parseArray(jsonString, cls);
        return list;
    }

    /**
     *
     * @param jsonString
     * @return
     */
    public static List<Map<String, Object>> createJsonToListMap(
            String jsonString) {
        return JSON.parseObject(jsonString,
                new TypeReference<List<Map<String, Object>>>() {
                });
    }




}
