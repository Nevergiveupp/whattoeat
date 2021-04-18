package com.wzc.whattoeat.service.intf;

import com.wzc.whattoeat.domain.Result;
import com.wzc.whattoeat.domain.User;

/**
 * 〈用户Service层接口〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
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
     * 更新用户次要信息
     *
     * @param user
     * @return
     */
    Result registerMinorInfo(User user);

    /**
     * 登录
     *
     * @param user
     * @return
     */
    Result login(User user);

}
