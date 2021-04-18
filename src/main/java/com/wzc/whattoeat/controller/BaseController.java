package com.wzc.whattoeat.controller;

import com.wzc.whattoeat.constant.CommonConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author PrinceCheng
 * @date 2021/4/18
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@Qualifier("baseController")
public class BaseController {

    protected static final Logger LOG = LoggerFactory.getLogger(BaseController.class);
    protected static final String MAP_KEY_EXC_NO = "excNo";
    protected static final String REQUEST_ATTRIBUTE_KEY_GRID = "gridResult";
    public static final String VIEW = "view";
    public static final String LIST = "list";
    public static final String STATUS = "status";
    public static final String WARN = "warn";
    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    public static final String MESSAGE = "message";
    public static final String MESSAGES = "messages";
    public static final String CONTENT = "content";

    /**
     * 内置对象 request
     */
    private HttpServletRequest request;

    /**
     * 内置对象 response
     */
    private HttpServletResponse response;

    /**
     * 参数列表 params
     */
    protected Map<String, Object> params;

    /**
     * 分页开始页
     */
    protected Integer page = CommonConstants.PAGE_START;

    /**
     * 分页行数参数
     */
    protected Integer pageSize = CommonConstants.PAGE_SIZE;

    /**
     * 返回页面消息
     */
    protected String msg;

    public HttpServletRequest getRequest() {
        return request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * AJAX输出，返回null
     *
     * @param content
     * @param type
     * @return
     */
    public String ajax(HttpServletResponse response, String content, String type) {
        try {
            response.setContentType(type + ";charset=UTF-8");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.getWriter().write(content);
            response.getWriter().flush();
        } catch (IOException e) {
            LOG.error("IOException:", e);
        }
        return null;
    }

    /**
     * AJAX输出文本，返回null
     *
     * @param text
     * @return
     */
    public String ajaxText(HttpServletResponse response, String text) {
        return ajax(response, text, "text/plain");
    }

    /**
     * AJAX输出HTML，返回null
     *
     * @param html
     * @return
     */
    public String ajaxHtml(HttpServletResponse response, String html) {
        return ajax(response, html, "text/html");
    }

    /**
     * AJAX输出XML，返回null
     *
     * @param xml
     * @return
     */
    public String ajaxXml(HttpServletResponse response, String xml) {
        return ajax(response, xml, "text/xml");
    }

    /**
     * 根据字符串输出JSON，返回null
     *
     * @param jsonString
     * @return
     */
    public String ajaxJson(HttpServletResponse response, String jsonString) {
        return ajax(response, jsonString, "text/html");
    }

    /**
     * 设置页面不缓存
     */
    public void setResponseNoCache(HttpServletResponse response) {
        response.setHeader("progma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", 0);
    }
}
