package com.wzc.whattoeat.controller;

import com.wzc.whattoeat.domain.Result;
import com.wzc.whattoeat.domain.User;
import com.wzc.whattoeat.service.intf.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 〈用户Controller〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping(value = "/register")
    public ModelAndView register(User user) {
        LOGGER.debug("注册用户信息-开始");
        ModelAndView mav = new ModelAndView();
        Result result = userService.register(user);
        if (result.isSuccess()) {
            LOGGER.debug("注册成功");
            mav.setViewName("redirect:/login.html");
        } else {
            LOGGER.error("注册失败");
            mav.setViewName("redirect:/register.html");
        }
        LOGGER.debug("注册用户信息-结束");
        return mav;
    }

    /**
     * 登录
     *
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping(value = "/login")
    public ModelAndView login(User user) {
        LOGGER.debug("用户登录-开始");
        ModelAndView mav = new ModelAndView();
        Result result = userService.login(user);
        if (result.isSuccess()) {
            LOGGER.debug("用户名密码验证正确，用户登录成功");
            mav.setViewName("redirect:/comment/queryComment?page=1&pageSize=5");
        } else {
            LOGGER.error("用户名密码验证失败，请重新登录");
            mav.setViewName("redirect:/login.html");
        }
        LOGGER.debug("用户登录-结束");
        return mav;
    }

}
