package com.wzc.whattoeat.service.impl;

import com.wzc.whattoeat.dao.intf.CommentMapper;
import com.wzc.whattoeat.domain.Comment;
import com.wzc.whattoeat.service.intf.CommentService;
import com.wzc.whattoeat.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 〈评论Service实现类〉<br>
 * 〈功能详细描述〉
 *
 * @author 88449524
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public Comment findById(Long id) {
        return commentMapper.findById(id);
    }

    @Override
    public List<Comment> findAll() {
        List<Comment> list = commentMapper.findAll();
        for (Comment comment : list) {
            System.out.println(comment.getCreateTime());//TODO 从数据库获取创建时间为空
        }
        return list;
    }

    @Override
    public void saveComment(Comment comment) {
        commentMapper.saveComment(comment);
    }
}
