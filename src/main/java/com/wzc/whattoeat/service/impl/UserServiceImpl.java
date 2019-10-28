package com.wzc.whattoeat.service.impl;

import com.wzc.whattoeat.dao.intf.UserMapper;
import com.wzc.whattoeat.domain.Result;
import com.wzc.whattoeat.domain.User;
import com.wzc.whattoeat.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈用户Service层实现类〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result register(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);

        try {
            User existUser = userMapper.findUserByName(user.getUsername());
            if (existUser != null) {
                //用户名已存在
                result.setMsg("用户名已存在");
            } else {
                userMapper.register(user);
                //System.out.println(user.getId());
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result login(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Long userId = userMapper.login(user);
            if (userId == null) {
                result.setMsg("用户名或密码错误");
            } else {
                result.setMsg("登录成功");
                result.setSuccess(true);
                user.setId(userId);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
