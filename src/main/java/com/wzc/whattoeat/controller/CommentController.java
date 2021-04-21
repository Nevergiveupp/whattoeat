package com.wzc.whattoeat.controller;

import com.github.pagehelper.Page;
import com.wzc.whattoeat.constant.CommonConstants;
import com.wzc.whattoeat.constant.ResponseConstant;
import com.wzc.whattoeat.domain.BaseResponse;
import com.wzc.whattoeat.domain.Comment;
import com.wzc.whattoeat.service.intf.CommentService;
import com.wzc.whattoeat.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈评论Controller〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

    private static final String VIEW_PATH = "comment";

    @Autowired
    private CommentService commentService;

    /**
     * 评论主页
     *
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView showIndex() {
        return new ModelAndView(VIEW_PATH);
    }

    /**
     * 根据id查询评论
     *
     * @param id
     * @return
     */
    @RequestMapping("/findComment/{id}")
    public String findById(@PathVariable Long id) {
        return commentService.findById(id).toString();
    }

    /**
     * 分页查询所有评论
     *
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping("/queryComment")
    public String queryComment(HttpServletRequest request, HttpServletResponse response, Integer page, Integer pageSize) {
        BaseResponse r = BaseResponse.ok();
        try {
            // 查询所有评论
            Page<Comment> commentList = commentService.findAllByPage(page, pageSize);
            int totalCount = commentService.queryTotalCount();
            r.put(CommonConstants.DATA, commentList);
            r.put(CommonConstants.TOTAL_COUNT, totalCount);
        } catch (Exception e) {
            LOGGER.error("CommentController queryComment 发生异常", e);
            r = BaseResponse.error(ResponseConstant.RETRUN_EXCEPTION, "分页查询所有评论发生异常");
        }
        return ajaxJson(response, JsonUtils.toJSON(r));


    }

    /**
     * 新增评论
     *
     * @param comment
     */
    @RequestMapping("/saveComment")
    @ResponseBody
    public void saveComment(HttpServletRequest request, HttpServletResponse response, @RequestBody Comment comment) {
        BaseResponse r = BaseResponse.ok();
        // 参数校验
        if (StringUtils.isBlank(comment.getComment())
                || StringUtils.isBlank(comment.getName())) {
            r = BaseResponse.error(ResponseConstant.RETRUN_NULLPARAMETER, "必填参数为空");
            LOGGER.error("CommentController saveComment 必填参数为空, errorMsg:{}", r.get(BaseResponse.MSG_NAME));
            ajaxJson(response, JsonUtils.toJSON(r));
            return;
        }
        try {
            // 保存评论
            commentService.saveComment(comment);
        } catch (Exception e) {
            r = BaseResponse.error(ResponseConstant.RETRUN_EXCEPTION, "新增批评异常");
            LOGGER.error("CommentController saveComment error, ", e);
        }
        ajaxJson(response, JsonUtils.toJSON(r));
    }

}
