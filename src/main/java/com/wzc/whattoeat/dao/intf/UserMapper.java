package com.wzc.whattoeat.dao.intf;

import com.wzc.whattoeat.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 〈用户Dao〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public interface UserMapper {

    /**
     * 查询用户名是否存在
     *
     * @param username
     * @return
     */
    User findUserByName(@Param("username") String username);

    /**
     * 注册  插入一条user记录
     *
     * @param user
     */
    void register(User user);

    /**
     * 登录
     *
     * @param user
     * @return
     */
    Long login(User user);
}
