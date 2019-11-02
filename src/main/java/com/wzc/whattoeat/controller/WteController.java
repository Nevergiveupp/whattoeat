package com.wzc.whattoeat.controller;

import com.github.pagehelper.Page;
import com.wzc.whattoeat.domain.Comment;
import com.wzc.whattoeat.service.intf.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈吃什么Controller〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/wte")
public class WteController {

    private static final String VIEW_PATH = "whatToEat";

    /**
     * 主页展示
     *
     * @return
     */
    @RequestMapping(value = "index")
    public ModelAndView showIndex() {
        return new ModelAndView(VIEW_PATH);
    }

}
