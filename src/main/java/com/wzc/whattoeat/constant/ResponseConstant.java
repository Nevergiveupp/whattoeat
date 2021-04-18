package com.wzc.whattoeat.constant;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author PrinceCheng
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ResponseConstant {

    private ResponseConstant() {

    }

    /**
     * 返回码 R000,成功
     */
    public static final String RETRUN_SUCCES = "R000";

    /**
     * 返回码 R001,入参为空
     */
    public static final String RETRUN_NULLPARAMETER = "R001";

    /**
     * 返回码 R002,系统异常
     */
    public static final String RETRUN_EXCEPTION = "R002";

    /**
     * 返回码 R003,校验失败
     */
    public static final String RETRUN_CHECK = "R003";

}
