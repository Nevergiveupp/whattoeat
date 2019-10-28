package com.wzc.whattoeat.service.intf;

import com.wzc.whattoeat.domain.Result;
import com.wzc.whattoeat.domain.User;

/**
 * 〈用户Service层接口〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface UserService {

    /**
     * 注册
     *
     * @param user
     * @return
     */
    Result register(User user);

    /**
     * 登录
     *
     * @param user
     * @return
     */
    Result login(User user);

}
