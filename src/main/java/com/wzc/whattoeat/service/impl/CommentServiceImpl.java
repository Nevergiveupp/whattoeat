package com.wzc.whattoeat.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wzc.whattoeat.dao.intf.CommentMapper;
import com.wzc.whattoeat.domain.Comment;
import com.wzc.whattoeat.service.intf.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈评论Service层实现类〉<br>
 * 〈功能详细描述〉
 *
 * @author PrinceCheng
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
    public Page<Comment> findAllByPage(Integer page, Integer pageSize) {
        // 设置默认分页
        if (null == page) {
            page = 1;
        }
        if (null == pageSize) {
            pageSize = 10;
        }
        PageHelper.startPage(page, pageSize);
        List<Comment> list = commentMapper.findAll();
        return (Page<Comment>) list;
    }

    @Override
    public void saveComment(Comment comment) {
        commentMapper.saveComment(comment);
    }

    @Override
    public int queryTotalCount() {
        return commentMapper.queryTotalCount();
    }
}
