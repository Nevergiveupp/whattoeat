package com.wzc.whattoeat.constant;

/**
 * 常量类
 *
 * @author PrinceCheng
 * @version 1.0.0
 * @created 2011-1-23 下午01:39:37
 * @date 2011-1-23 下午01:39:37
 */

public class CommonConstants {
    /**
     * 文本数据输出编码格式
     */
    public final static String CONTENT_TYPE_TEXT = "text/html;charset=UTF-8";

    /**
     * XML数据输出编码格式
     */
    public final static String CONTENT_TYPE_XML = "xml/html;charset=UTF-8";

    /**
     * 分页默认开始
     */
    public final static int PAGE_START = 1;

    /**
     * 分页默认行数
     */
    public final static int PAGE_SIZE = 10;


    /**
     * 国际化和主题
     */
    public final static String LOCALECOUNTRY = "country";
    public final static String LOCALECOUNTRY_DEFAULT = "CN";
    public final static String LANGUAGECODE = "languagecode";
    public final static String LANGUAGECODE_DEFAULT = "zh";
    public final static String THEME = "theme";
    public final static String THEME_DEFAULT = "default";
    public final static int LOCALE_THEME_MAXAGE = 24 * 60 * 60;

    /**
     * cookie ticket
     */
    public final static String TICKET_NAME = "usernamekey";

    /**
     * cookie name
     */
    public final static String COOKIE_USER_NAME = "Login_UserName";

    /**
     * 5分钟，秒为单位
     */
    public final static int FIVE_MINUTES = 60 * 5;

    /**
     * 登录Session超期时间 seconds
     */
    public final static int SESSIN_TIME_SECONDS = 60 * 30;

    /**
     * 缓存的记录超时时间 24小时
     */
    public final static int REDIS_TIME_SECONDS = 60 * 60 * 24;

    /**
     * 缓存的记录超时时间 7天
     */
    public final static int REDIS_TIME_SEVENDAY = 60 * 60 * 24 * 7;

    /**
     * 云信查询运单信息及物流详情时token的缓存时间（60分钟）
     */
    public final static int YUNXIN_TOKEN_REDIS_TIME_SECONDS = 60 * 60 * 1;

    /**
     * 缓存字典表的key的前缀
     */
    public final static String REDIS_DICTIONART_PRE = "com.suning.fw.common.dictionaryinf.";
    /**
     * 邮件的文本类型
     */
    public final static String MAIL_TEXT = "text";
    /**
     * 邮件的HTML类型
     */
    public final static String MAIL_HTML = "html";
    /**
     * 邮件的编码格式
     */
    public final static String MAIL_CHARSET = "UTF-8";
    /**
     * 用户客户端IP
     */
    public final static String USER_IP = "IP";
    /*
     * 单引号
     */
    public static final String SINGLE_QUOTE = "'";
    /*
     * 逗号
     */
    public static final String COMMA = ",";

    /*
     * 分号
     */
    public static final String SPLIT_SEMICOLON = ";";

    /**
     * -分隔符
     */
    public static final String SPLIT_LINE = "-";

    /**
     * _分隔符
     */
    public static final String SPLIT_BOTTOMLINE = "_";
    /*
     * 带单引号的逗号
     */
    public static final String ROUNDQUOTE_COMMA = "','";

    /**
     * 点号
     */
    public static final String STR_DOT = ".";

    /**
     * 点号
     */
    public static final char CHAR_DOT = '.';

    /**
     * 点号正则表达式
     */
    public static final String REGEX_DOT = "\\.";

    /**
     * EXCEL类型xlsx
     */
    public static final String EXCEL_SUFFIX_XLSX = "xlsx";

    /**
     * EXCEL类型xls
     */
    public static final String EXCEL_SUFFIX_XLS = "xls";

    /*
     * 空字符
     */
    public static final String EMPTY_STR = "";

    public static final String INVOKE_METHOD_NAME = "methodName";

    public static final String INVOKE_BEAN_ID = "beanId";


    // 总数:该常量不能修改 rxm
    public static final String TOTALCOUNT = "totalCount";
    // 设置检索开始行
    public static final String STARTINDEX = "startIndex";
    // 设置检索数据个数
    public static final String MAXCOUNT = "maxCount";

    /**
     * 该属性主要用于ParamsUtils类, 用于将文件类型表单参数作为request的属性,属性名即为 autoAttribute
     */
    public static final String AUTOATTRIBUTE = "autoAttribute";

    /**
     * 缓存中bfwusernamekey
     */
    public static final String BFW_USER_KEY = "bfw_bmusernamekey";

    public static final int NUM_NEGATIVE_ONE = -1;

    public static final String STR_0 = "0";
    public static final String STR_1 = "1";
    public static final String STR_2 = "2";
    public static final String STR_3 = "3";
    public static final String STR_4 = "4";
    public static final String STR_5 = "5";
    public static final String STR_00 = "00";
    public static final String STR_01 = "01";
    public static final String STR_02 = "02";
    public static final String STR_03 = "03";
    public static final String STR_NEGATIVE_ONE = "-1";

    public static final String YES = "Y";
    public static final String NO = "N";

    public static final int NUM_0 = 0;
    public static final int NUM_1 = 1;
    public static final int NUM_2 = 2;
    public static final int NUM_3 = 3;
    public static final int NUM_5 = 5;
    public static final int NUM_7 = 7;
    public static final int NUM_10 = 10;
    public static final int NUM_100 = 100;

    public static final int NUM_NEGATIVE_3 = -3;
    public static final int NUM_NEGATIVE_7 = -7;
    public static final int NUM_NEGATIVE_10 = -10;
    public static final int NUM_NEGATIVE_6 = -6;

    public static final String STR_E = "E";

    public static final char CHAR_E = 'E';

    public static final String CHARACTER_SET_UTF8 = "utf-8";

    public static final String CLASS_TYPE_STRING = "class java.lang.String";

    public static final String CLASS_TYPE_INT = "int";

    public static final String CLASS_TYPE_DOUBLE = "double";

    public static final String CLASS_TYPE_DATE = "class java.util.Date";

    public static final String CLASS_TYPE_BIGDECIMAL = "class java.math.BigDecimal";

    /**
     * 用户名session对应的KEY
     */
    public static final String USER_NAME = "SEL-UserName";

    /**
     * 系统简称
     */
    public static final String SERVICE_CODE = "LCSS";

    public static final String REQUEST_STR = "Request";

    public static final String IVR_ROLE_NAME = "ivr_role_name";

    public static final String IVR_SN_ROLE_NAME = "ivr_sn_role_name";

    /**
     * 苏宁指定问题类型
     */
    public static final String IVR_TT_PROBLEMDESC = "ivr_tt_problemdesc";

    /**
     * 苏宁坐席 业务报备 逆向反馈事由
     */
    public static final String IVR_SN_FEEDBACKCAUSE = "ivr_sn_feedbackCause";

    /**
     * 业务来源配置查询限制
     */
    public static final String SCM_BUSINESS_SOURCE_SETTING_QUERY_LIMIT = "scm_businessSourceLimit";

    /**
     * 供应商模糊查询限制
     */
    public static final String SCM_CARRIER_QUERY_LIMIT = "scm_carrier_query_limit";

    /*
     * null
     */
    public static final String STR_NULL = "null";

    public static class Status {

        private Status() {

        }

        //生效
        public static final String VALID = "1";

        //失效
        public static final String INVALID = "0";
    }

    /**
     * 处理状态
     */
    public static class DealStatus {
        private DealStatus() {

        }

        //待处理
        public static final String PENDING = "0";

        //处理成功
        public static final String SUCCESS = "1";

        //处理失败
        public static final String FAILED = "2";
    }

    /**
     * 主动服务单类型
     */
    public static class ActiveServiceType {
        private ActiveServiceType() {

        }

        //异常事件单
        public static final String ABNORMAL_EVENTS = "1101";

        //主动报备
        public static final String BUSINESS_REPORT = "1102";

        //客诉前置
        public static final String ABNORMAL_REPORT = "1103";
    }

    /**
     * Add a private constructor to hide the implicit public one.
     * Sonar的建议
     *
     * @author 17030368
     * @see [相关类/方法]（可选）
     * @since [产品/模块版本] （可选）
     */
    private CommonConstants() {

    }
}
