package com.wzc.whattoeat.controller;

import com.github.pagehelper.Page;
import com.wzc.whattoeat.domain.Comment;
import com.wzc.whattoeat.service.intf.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈评论Controller〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    private static final String VIEW_PATH = "whatToEat";

    @Autowired
    private CommentService commentService;

    /**
     * 根据id查询评论
     *
     * @param id
     * @return
     */
    @RequestMapping("findComment/{id}")
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
    @RequestMapping(value = "queryComment")
    public ModelAndView queryComment(Integer page, Integer pageSize) {

        ModelAndView modelAndView = new ModelAndView(VIEW_PATH);
        Page<Comment> commentList = commentService.findAllByPage(page, pageSize);
        modelAndView.addObject("commentList", commentList);
        int count = commentService.queryTotalCount();
        modelAndView.addObject("count",count);
        return modelAndView;
    }

    /**
     * 新增评论
     *
     * @param comment
     */
    @RequestMapping("saveComment")
    @ResponseBody
    public void saveGiftPackage(@RequestBody Comment comment) {
        commentService.saveComment(comment);
    }

}
