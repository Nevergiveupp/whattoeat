package com.wzc.whattoeat.controller;

import com.wzc.whattoeat.domain.Result;
import com.wzc.whattoeat.domain.User;
import com.wzc.whattoeat.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping(value = "/register")
    public Result register(User user) {
        return userService.register(user);
    }

    /**
     * 登录
     *
     * @param user 参数封装
     * @return Result
     */
    @RequestMapping(value = "/login")
    public Result login(User user) {
        return userService.login(user);
    }

}
