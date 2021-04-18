package com.wzc.whattoeat.domain;

import lombok.Data;

/**
 * 〈评论实体类〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Data
public class Comment {

    private Long id;

    private String name;

    private String comment;

    private String createTime;

}
