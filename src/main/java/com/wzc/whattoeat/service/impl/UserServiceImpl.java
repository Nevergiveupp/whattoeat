package com.wzc.whattoeat.service.impl;

import com.wzc.whattoeat.dao.intf.UserMapper;
import com.wzc.whattoeat.domain.Result;
import com.wzc.whattoeat.domain.User;
import com.wzc.whattoeat.service.intf.UserService;
import com.wzc.whattoeat.utils.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 〈用户Service层实现类〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result register(User user) {
        LOGGER.debug("用户注册-服务-开始，入参:{}", user);
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);

        try {
            User existUser = userMapper.findUserByName(user.getUsername());
            if (existUser != null) {
                LOGGER.debug("用户名已存在，用户:{}", existUser);
                result.setMsg("用户名已存在");
            } else {
                user.setCreateTime(DateUtil.formatDate(new Date(),DateUtil.DATE_FORMAT_YYYY_MM_DD_HH_MM_SS));
                userMapper.insertUser(user);
                LOGGER.debug("用户注册成功，注册用户:{}", user);
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        LOGGER.debug("用户注册-服务-结束，结果:{}", result);
        return result;
    }

    /**
     * 更新用户次要信息
     *
     * @param user
     * @return
     */
    @Override
    public Result registerMinorInfo(User user) {
        Result result = new Result();
        result.setSuccess(false);
        // TODO 这里user.getUsername() == null
        int i = userMapper.updateMinorInfoByUsername(user.getUsername());
        if (i == 1) {
            LOGGER.debug("服务-更新用户次要信息-成功，用户user:{},次数i:{}", user, i);
            result.setSuccess(true);
            result.setMsg("更新用户信息成功");
        } else {
            LOGGER.debug("服务-更新用户次要信息-成功，用户user:{},次数i:{}", user, i);
            result.setMsg("更新用户信息失败");
        }
        return result;
    }


    @Override
    public Result login(User user) {
        LOGGER.debug("用户登录-服务-开始，入参:{}", user);
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Long userId = userMapper.selectIdByUsernameAndPassword(user);
            if (userId == null) {
                result.setMsg("用户名或密码错误");
            } else {
                result.setMsg("登录成功");
                result.setSuccess(true);
                user.setId(userId);
                result.setDetail(user);
            }
        } catch (Exception e) {
            LOGGER.error("用户登录-服务-异常，异常:{}", e.getMessage());
//            e.printStackTrace();
        }
        LOGGER.debug("用户登录-服务-结束，结果:{}", result);
        return result;
    }
}
