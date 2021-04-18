package com.wzc.whattoeat.domain;

import com.alibaba.fastjson.JSON;
import com.wzc.whattoeat.constant.ResponseConstant;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉基础响应<br>
 *
 * @author PrinceCheng
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class BaseResponse extends HashMap<String, Object> {

    //结果字段名
    public static final String RESULT_NAME = "result";

    //消息字段名
    public static final String MSG_NAME = "msg";

    //错误码
    public static final String CODE_NAME = "code";

    //成功描述
    public static final String SUCCESS_DESC = "成功";

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private BaseResponse(){}


    public static BaseResponse ok(){
        BaseResponse r = new BaseResponse();
        r.put(RESULT_NAME, true);
        r.put(CODE_NAME, ResponseConstant.RETRUN_SUCCES);
        r.put(MSG_NAME, SUCCESS_DESC);
        return r;
    }

    public static BaseResponse ok(String msg){
        BaseResponse r = new BaseResponse();
        r.put(RESULT_NAME, true);
        r.put(CODE_NAME, ResponseConstant.RETRUN_SUCCES);
        r.put(MSG_NAME, msg);
        return r;
    }

    public static BaseResponse error(String msg){
        BaseResponse r = new BaseResponse();
        r.put(RESULT_NAME, false);
        r.put(MSG_NAME, msg);
        return r;
    }

    public static BaseResponse error(String errCode,String msg){
        BaseResponse r = new BaseResponse();
        r.put(RESULT_NAME, false);
        r.put(CODE_NAME, errCode);
        r.put(MSG_NAME, msg);
        return r;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }

}
