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
    public List<Comment> findAllByPage(Integer page, Integer pageSize) {
        Page<Comment> pages = PageHelper.startPage(page, pageSize);
        List<Comment> list = commentMapper.findAll();
        for (Comment comment : list) {
            System.out.println(comment.getCreateTime());//TODO 从数据库获取创建时间为空
        }
        System.out.println("总记录数：" + pages.getTotal());
        System.out.println("当前页：" + pages.getPageNum());
        System.out.println("每页记录数：" + pages.getPageSize());
        System.out.println("当前页记录数：" + pages.size());
        System.out.println("总页数：" + pages.getPages());
        return list;
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
