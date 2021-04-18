package com.wzc.whattoeat.domain;

import lombok.Data;

/**
 * 〈用户实体类〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Data
public class User {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String mobile;

    private String nickName;

    private String gender;

    private String createTime;

}
