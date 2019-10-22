package com.wzc.whattoeat.service.intf;

import com.wzc.whattoeat.domain.Comment;

import java.util.List;

/**
 * 〈评论Service接口〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface CommentService {

    /**
     * 根据id查询评论
     * @return
     */
    Comment findById(Long id);

    /**
     * 查询所有评论
     * @return
     */
    List<Comment> findAllByPage(Integer page, Integer pageSize);

    /**
     * 新增评论
     * @param comment
     */
    void saveComment(Comment comment);

    /**
     * 查询评论总条数
     * @return
     */
    int queryTotalCount();
}
