package com.wzc.whattoeat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/about")
public class AboutController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private static final String VIEW_SITE_PATH = "about_site";

    private static final String VIEW_AUTHOR_PATH = "about_author";

    /**
     * 展示关于本站
     *
     * @return
     */
    @RequestMapping("/showSite")
    public ModelAndView showSite() {
        return new ModelAndView(VIEW_SITE_PATH);
    }

    /**
     * 展示关于本人
     *
     * @return
     */
    @RequestMapping("/showAuthor")
    public ModelAndView showAuthor() {
        return new ModelAndView(VIEW_AUTHOR_PATH);
    }
}
