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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    private static final String VIEW_LOGIN_PATH = "login_owl";

    private static final String VIEW_REGISTER_PATH = "register_owl";

    @Autowired
    private UserService userService;

    /**
     * 展示注册页
     *
     * @return
     */
    @RequestMapping("/showRegister")
    public ModelAndView showRegister() {
        return new ModelAndView(VIEW_REGISTER_PATH);
    }

    /**
     * 注册
     *
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping("/register")
    public ModelAndView register(User user) {
        LOGGER.debug("注册用户信息-开始");
        ModelAndView mav = new ModelAndView();
        Result result = userService.register(user);
        if (result.isSuccess()) {
            LOGGER.debug("注册成功");
            mav.addObject("result", result);
            mav.setViewName("redirect:/user/showLogin");
        } else {
            LOGGER.error("注册失败");
            mav.addObject("result", result);
            mav.setViewName("redirect:/user/showRegister");
        }
        LOGGER.debug("注册用户信息-结束");
        return mav;
    }

    /**
     * 次要信息提交
     *
     * @param user 参数封装
     * @return Result
     */

    @RequestMapping("/registerMinorInfo")
    public ModelAndView registerMinorInfo(User user) {
        LOGGER.debug("次要信息提交-开始");
        ModelAndView mav = new ModelAndView();
        Result result = userService.registerMinorInfo(user);
        if (result.isSuccess()) {
            LOGGER.debug("更新用户次要信息成功,result:{}", result.getMsg());
            mav.addObject("result", result);
            mav.setViewName("redirect:/user/showLogin");
        } else {
            LOGGER.error("更新用户次要信息失败,result:{}", result.getMsg());
            mav.addObject("result", result);
            mav.setViewName("redirect:/user/showRegister");
        }
        LOGGER.debug("次要信息提交-结束");
        return mav;
    }

    /**
     * 展示登录页
     *
     * @return
     */
    @RequestMapping("/showLogin")
    public ModelAndView showLogin() {
        return new ModelAndView(VIEW_LOGIN_PATH);
    }

    /**
     * 登录
     *
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping("/login")
    public ModelAndView login(User user, HttpServletRequest request) {
        LOGGER.debug("用户登录-开始");
        ModelAndView mav = new ModelAndView();
        Result result = userService.login(user);
        if (result.isSuccess()) {
            LOGGER.debug("用户名密码验证正确，用户登录成功");
            mav.addObject("result", result);
            mav.setViewName("redirect:/wte/index");
            HttpSession session = request.getSession(true);
            session.setAttribute("username", user.getUsername());
        } else {
            LOGGER.error("用户名密码验证失败，请重新登录");
            mav.addObject("result", result);
            mav.setViewName("redirect:/user/showLogin");
        }
        LOGGER.debug("用户登录-结束");
        return mav;
    }


}
