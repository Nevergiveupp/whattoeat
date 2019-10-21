package com.wzc.whattoeat.dao.intf;

import com.wzc.whattoeat.domain.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈评论Dao〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public interface CommentMapper {

    /**
     * 根据id查询评论
     * @return
     */
    Comment findById(Long id);

    /**
     * 查询所有评论
     * @return
     */
    List<Comment> findAll();

    /**
     * 新增评论
     * @param comment
     */
    void saveComment(Comment comment);
}
