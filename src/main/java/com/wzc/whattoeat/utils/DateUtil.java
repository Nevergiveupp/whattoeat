package com.wzc.whattoeat.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * 〈日期工具类〉<br>
 * 〈功能详细描述〉
 * 
 * @author 15032051
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public final class DateUtil {
    /** 时间格式类型yyyyMMdd **/
    public static final String DATE_FORMATE_YYYY_MM_DD_HHMMSS = "yyyy-MM-dd-HH.mm.ss";
    public static final String DATE_FORMATE_MM_DD_HHMMSS = "MM-dd HH:mm:ss";
    public static final String PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
    public final static String PATTERN_YYYYMMDD = "yyyyMMdd";

    // 时间格式
    public static final String PATTERN_HH_mm_ss = "HHmmss";
    /** 时间格式类型yyyyMMdd **/
    public static final String PATTERN_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public final static String DATEFORMATE_YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    public final static String DATE_FORMAT_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /** 按照日期计算类型 **/
    public static final String DAY = "day";
    /** 按照月计算类型 **/
    public static final String MONTH = "month";
    /** 按照年计算类型 **/
    public static final String YEAR = "year";
    /** 日志 **/
    private static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    /** 构造方法 **/
    private DateUtil() {
    }

    /**
     *
     * 功能描述:根据指定格式，格式化日期 <br>
     * 〈功能详细描述〉
     *
     * @param date
     * @param format
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public static String formatDate(Date date, String format) {
        SimpleDateFormat dateformat = new SimpleDateFormat(format);
        if (null == date) {
            return null;
        }
        return dateformat.format(date);
    }

}
