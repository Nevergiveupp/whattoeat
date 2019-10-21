package com.wzc.whattoeat.controller;

import com.wzc.whattoeat.domain.Comment;
import com.wzc.whattoeat.service.intf.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    private static final String VIEW_PATH ="whatToEat";

    @Autowired
    private CommentService commentService;

    @RequestMapping("findComment/{id}")
    public String findById(@PathVariable Long id) {
        return commentService.findById(id).toString();
    }

    @RequestMapping("/queryComment")
    public ModelAndView queryComment() {
        ModelAndView modelAndView = new ModelAndView(VIEW_PATH);
        List<Comment> commentList = commentService.findAll();
        modelAndView.addObject("commentList", commentList);
        return modelAndView;
    }

    @RequestMapping("/saveComment")
    @ResponseBody
    public void saveGiftPackage(@RequestBody Comment comment) {
        commentService.saveComment(comment);
    }

}
